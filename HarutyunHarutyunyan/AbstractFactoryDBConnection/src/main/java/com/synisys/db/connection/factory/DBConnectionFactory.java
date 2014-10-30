package com.synisys.db.connection.factory;

public class DBConnectionFactory {

	private DBConnectionFactory() {
	}

	public static IConnectionFactory getConnectionFactory() {

		String factoryName = System.getProperty("DB_CONNECTION_FACTORY");
		IConnectionFactory connectionFactory = null;

		if (factoryName != null) {
			try {
				Class<?> clazz = Class.forName(factoryName);
				connectionFactory = (IConnectionFactory) clazz.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			throw new IllegalArgumentException(
					"No system property specified : DB_CONNECTION_FACTORY");
		}

		return connectionFactory;
	}
}