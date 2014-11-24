package com.synisys.training.patterns.decorator;

import org.perf4j.StopWatch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TimedQueryExecutor implements QueryExecutor {

	private final QueryExecutor queryExecutor;
	private List<StopWatch> statistics = new ArrayList<>();

	public TimedQueryExecutor(QueryExecutor queryExecutor) {
		this.queryExecutor = queryExecutor;
	}

	@Override
	public ResultSet executeQuery(String query) throws SQLException {
		StopWatch watch = new StopWatch();
		ResultSet resultSet = this.queryExecutor.executeQuery(query);
		watch.stop("%s \n executed.", query);
		this.statistics.add(watch);
		return resultSet;
	}

	public List<StopWatch> getStatistics() {
		return this.statistics;
	}

}
