package com.synisys.db.connection.factory;

import com.synisys.db.connection.IConnection;
import com.synisys.db.connection.OracleConnection;

public class OracleConnectionFactory implements IConnectionFactory {

  
  public IConnection getConnection() {
    return new OracleConnection();
  }
}