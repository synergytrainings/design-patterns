package com.synisys.training.patterns.decorator;


import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryExecutor {

	ResultSet executeQuery(String query) throws SQLException;
}
