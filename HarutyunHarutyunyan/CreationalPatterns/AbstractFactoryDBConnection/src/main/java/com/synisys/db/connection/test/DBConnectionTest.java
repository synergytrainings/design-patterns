package com.synisys.db.connection.test;

import com.synisys.db.connection.IConnection;
import com.synisys.db.connection.factory.DBConnectionFactory;
import com.synisys.db.connection.factory.IConnectionFactory;


public class DBConnectionTest {

	  /**
	   * @param args
	   */
	  public static void main(String[] args) {

	    /**
	     * Get Connection from OracleConnectionFactory
	     */
	    System.setProperty("DB_CONNECTION_FACTORY", 
	        "com.synisys.db.connection.factory.OracleConnectionFactory");
	    
	    IConnectionFactory factory = DBConnectionFactory.getConnectionFactory();
	    IConnection connection = factory.getConnection();
	    System.out.println("Obtained connection for DB Vendor : " + connection.getVendorName());
	    
	    
	    /**
	     * Get Connection from MySQLConnectionFactory
	     */
	    System.setProperty("DB_CONNECTION_FACTORY", 
	        "com.synisys.db.connection.factory.MySQLConnectionFactory");
	    
	    factory = DBConnectionFactory.getConnectionFactory();
	    connection = factory.getConnection();
	    System.out.println("Obtained connection for DB Vendor : " + connection.getVendorName());
	  }

	}