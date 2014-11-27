package com.synisys.facade;

import java.sql.Connection;

public class OracleImporter {
 
    public static Connection getOracleDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }
     
    public void importExceltoOracleDB(String tableName, Connection con){
    	//set data from selected Excel to Oracle DB
    }
     
    public void importXMLtoOracleDB(String tableName, Connection con){
        //set data from selected xml to Oracle DB
    }
     
}