package com.synisys.db.connection.factory;

import com.synisys.db.connection.IConnection;

public interface IConnectionFactory {

	/**
	 * Get the connection associated with this DB factory.
	 * 
	 * @return
	 */
	public IConnection getConnection();

}