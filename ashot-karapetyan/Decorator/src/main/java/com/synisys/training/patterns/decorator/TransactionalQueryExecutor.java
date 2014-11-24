package com.synisys.training.patterns.decorator;


import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionalQueryExecutor implements QueryExecutor {

	private final QueryExecutor queryExecutor;

	public TransactionalQueryExecutor(QueryExecutor queryExecutor) {
		this.queryExecutor = queryExecutor;
	}

	@Override
	public ResultSet executeQuery(String query) throws SQLException {
		openTransaction();
		ResultSet resultSet;
		try {
			resultSet = this.queryExecutor.executeQuery(query);
			commitTransaction();
		} catch (SQLException e) {
			rollBackTransaction();
			throw new SQLException(e);
		}
		return resultSet;
	}


	protected void rollBackTransaction() {
		//roll back .
	}

	protected void commitTransaction() {
		//commitTransaction
	}


	protected void openTransaction() {
		//open transaction;
	}
}
