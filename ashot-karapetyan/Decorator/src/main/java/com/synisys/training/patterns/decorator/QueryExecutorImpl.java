package com.synisys.training.patterns.decorator;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


public class QueryExecutorImpl implements QueryExecutor {

	private final DataSource dataSource;

	public QueryExecutorImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public ResultSet executeQuery(String query) throws SQLException {
		return dataSource.getConnection().prepareStatement(query).executeQuery(query);
	}
}
