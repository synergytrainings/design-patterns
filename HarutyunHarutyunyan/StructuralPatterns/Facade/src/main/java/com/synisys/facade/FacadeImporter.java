package com.synisys.facade;

import java.sql.Connection;

public class FacadeImporter {

	public static void importFile(DBTypes dbType, ReportTypes reportType,
			String filePath) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = MySqlImporter.getMySqlDBConnection();
			MySqlImporter mySqlHelper = new MySqlImporter();
			switch (reportType) {
			case XML:
				mySqlHelper.importXMLtoMySqlDB(filePath, con);
				break;
			case EXCEL:
				mySqlHelper.importExceltoMySqlDB(filePath, con);
				break;
			}
			break;
		case ORACLE:
			con = OracleImporter.getOracleDBConnection();
			OracleImporter oracleHelper = new OracleImporter();
			switch (reportType) {
			case XML:
				oracleHelper.importXMLtoOracleDB(filePath, con);
				break;
			case EXCEL:
				oracleHelper.importExceltoOracleDB(filePath, con);
				break;
			}
			break;
		}

	}

	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		XML, EXCEL;
	}
}