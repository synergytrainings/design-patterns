package singleton.main;

public class DBSingletonConnection {

	private String host;
	private int port;

	private static DBSingletonConnection dbConnection = null;

	/**
	 * Makes private to avoid duplicating object
	 */
	private DBSingletonConnection() {
	};

	/**
	 * Allows user to create DBSingletonConnection class only once.
	 * This is a thread safe method and can be used wherever possible
	 * @return new DBSingletonConnection object
	 */
	public static DBSingletonConnection getInstance() {
		if (dbConnection == null) {
			synchronized (DBSingletonConnection.class) {
				if (dbConnection == null) {
					dbConnection = new DBSingletonConnection();
				}
			}
		}
		return dbConnection;
	}
}
