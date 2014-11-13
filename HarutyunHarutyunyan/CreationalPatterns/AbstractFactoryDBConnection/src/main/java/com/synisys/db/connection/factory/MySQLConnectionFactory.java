package com.synisys.db.connection.factory;

import com.synisys.db.connection.IConnection;
import com.synisys.db.connection.MySQLConnection;

public class MySQLConnectionFactory implements IConnectionFactory {

	  
	  public IConnection getConnection() {
	    return new MySQLConnection();
	  }
	}