package com.synisys.training.patterns.decorator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.perf4j.StopWatch;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.anyString;
import static org.mockito.BDDMockito.inOrder;
import static org.mockito.BDDMockito.spy;
import static org.mockito.BDDMockito.times;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Tests for query executors.
 */
public class TestQueryExecutor {

	private static final String QUERY_FOR_EXCEPTION = "QUERY_FOR_EXCEPTION";
	private DataSource mockedDataSource;

	@Before
	public void setUp() throws SQLException {

		mockDataSource();
	}

	@Test
	public void testTimedQueryExecutor() throws SQLException {

		//spying for later verifications
		QueryExecutor executor = spy(new QueryExecutorImpl(this.mockedDataSource));

		QueryExecutor timedQueryExecutor = new TimedQueryExecutor(executor);

		final String dummyQuery1 = "Dummy query 1";
		final String dummyQuery2 = "Dummy query 2";

		timedQueryExecutor.executeQuery(dummyQuery1);
		timedQueryExecutor.executeQuery(dummyQuery2);

		/**  Verifying **/
		//casting for verification
		List<StopWatch> watches = ((TimedQueryExecutor) timedQueryExecutor).getStatistics();
		assertEquals(2, watches.size());

		assertThat(watches.get(0).getElapsedTime(), is(greaterThan(1000L)));
		assertThat(watches.get(1).getElapsedTime(), is(greaterThan(1000L)));

		verify(executor).executeQuery(dummyQuery1);
		verify(executor).executeQuery(dummyQuery2);


	}

	@Test
	public void testTransactionalQueryExecutorCommitted() throws SQLException {

		//spying for later verifications
		QueryExecutor executor = spy(new QueryExecutorImpl(this.mockedDataSource));
		QueryExecutor transactionalExecutor = spy(new TransactionalQueryExecutor(executor));

		final String dummyQuery = "Dummy query.";

		transactionalExecutor.executeQuery(dummyQuery);


		/**  Verifying **/
		//casting for verification
		TransactionalQueryExecutor transactionalQueryExecutor = (TransactionalQueryExecutor) transactionalExecutor;
		InOrder inOrder = inOrder(transactionalQueryExecutor);
		inOrder.verify(transactionalQueryExecutor, times(1)).openTransaction();
		inOrder.verify(transactionalQueryExecutor, times(1)).commitTransaction();

		verify(executor).executeQuery(dummyQuery);
	}

	@Test
	public void testTransactionalQueryExecutorRollBacked() throws SQLException {

		//spying for later verifications
		QueryExecutor executor = spy(new QueryExecutorImpl(this.mockedDataSource));
		QueryExecutor queryExecutor = spy(new TransactionalQueryExecutor(executor));


		try {
			queryExecutor.executeQuery(QUERY_FOR_EXCEPTION);
			fail("SQLException is expected!");
		} catch (SQLException e) {
			//it is OK. SQLException is expected.
		}

		/**  Verifying **/
		//casting for verification
		TransactionalQueryExecutor transactionalQueryExecutor = (TransactionalQueryExecutor) queryExecutor;
		InOrder inOrder = inOrder(transactionalQueryExecutor);
		inOrder.verify(transactionalQueryExecutor, times(1)).openTransaction();
		inOrder.verify(transactionalQueryExecutor, times(1)).rollBackTransaction();
		verify(executor).executeQuery(QUERY_FOR_EXCEPTION);
	}

	@Test
	public void testChainingQueryExecutor() throws SQLException {

		//spying for later verifications
		QueryExecutor executor = spy(new QueryExecutorImpl(this.mockedDataSource));
		QueryExecutor transactionalExecutor = spy(new TransactionalQueryExecutor(executor));
		QueryExecutor timedExecutor = spy(new TimedQueryExecutor(transactionalExecutor));

		final String dummyQuery = "Dummy query.";

		timedExecutor.executeQuery(dummyQuery);

		/**  Verifying **/
		//casting for verification
		TransactionalQueryExecutor transactionalQueryExecutor = (TransactionalQueryExecutor) transactionalExecutor;
		InOrder inOrder = inOrder(transactionalQueryExecutor);
		inOrder.verify(transactionalQueryExecutor, times(1)).openTransaction();
		inOrder.verify(transactionalQueryExecutor, times(1)).commitTransaction();


		//casting for verification
		TimedQueryExecutor timedQueryExecutor = (TimedQueryExecutor) timedExecutor;
		List<StopWatch> watches = timedQueryExecutor.getStatistics();
		assertEquals(1, watches.size());
		assertThat(watches.get(0).getElapsedTime(), is(greaterThan(1000L)));

		verify(executor).executeQuery(dummyQuery);


	}


	/**
	 * Mocks DataSource, connection of dataSource, PreparedStatement and result of executeQuery.
	 * @throws SQLException
	 */
	private void mockDataSource() throws SQLException {

		this.mockedDataSource = mock(DataSource.class);
		mock(Connection.class);
		Connection mockedConnection = mock(Connection.class);
		PreparedStatement mockedPreparedStatement = mock(PreparedStatement.class);
		final ResultSet mockedResultSet = mock(ResultSet.class);

		when(this.mockedDataSource.getConnection()).thenReturn(mockedConnection);
		when(mockedConnection.prepareStatement(anyString())).thenReturn(mockedPreparedStatement);

		when(mockedPreparedStatement.executeQuery(anyString())).then(new Answer<ResultSet>() {
			@Override
			public ResultSet answer(InvocationOnMock invocationOnMock) throws Throwable {
				String queryForException = (String) invocationOnMock.getArguments()[0];
				if (QUERY_FOR_EXCEPTION.equals(queryForException)) {
					throw new SQLException("Exception for test");
				}
				Thread.sleep(1500);//simulate query execution.
				return mockedResultSet;
			}
		});
	}
}
