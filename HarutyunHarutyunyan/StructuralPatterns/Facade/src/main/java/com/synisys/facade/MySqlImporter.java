package com.synisys.facade;

import java.sql.Connection;

public class MySqlImporter {

	public static Connection getMySqlDBConnection() {
		// get MySql DB connection using connection parameters
		return null;
	}

	public void importExceltoMySqlDB(String tableName, Connection con) {
		// set data from selected Excel to MySql DB
	}

	public void importXMLtoMySqlDB(String tableName, Connection con) {
		// set data from selected xml to MySql DB
	}
}
