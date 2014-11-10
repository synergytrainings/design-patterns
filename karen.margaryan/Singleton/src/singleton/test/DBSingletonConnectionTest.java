package singleton.test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.main.DBSingletonConnection;

public class DBSingletonConnectionTest {

	/**
	 * Checks whether the singletong pattern works fine or not.
	 */
	@Test
	public void test() {
		DBSingletonConnection conn1 = DBSingletonConnection.getInstance();
		DBSingletonConnection conn2 = DBSingletonConnection.getInstance();
		
		assertEquals("It's used singleton design pattern but created two different objects", 
				conn1.toString(), conn2.toString());
	}

}
