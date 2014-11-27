package com.synisys.facade;

import java.sql.Connection;

public class FacadeImporter {

	public static void importFile(DBTypes dbType, FileTypes fileType,
			String filePath) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = MySqlImporter.getMySqlDBConnection();
			MySqlImporter mySqlImporter = new MySqlImporter();
			switch (fileType) {
			case XML:
				mySqlImporter.importXMLtoMySqlDB(filePath, con);
				break;
			case EXCEL:
				mySqlImporter.importExceltoMySqlDB(filePath, con);
				break;
			}
			break;
		case ORACLE:
			con = OracleImporter.getOracleDBConnection();
			OracleImporter oracleImporter = new OracleImporter();
			switch (fileType) {
			case XML:
				oracleImporter.importXMLtoOracleDB(filePath, con);
				break;
			case EXCEL:
				oracleImporter.importExceltoOracleDB(filePath, con);
				break;
			}
			break;
		}

	}

	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum FileTypes {
		XML, EXCEL;
	}
}