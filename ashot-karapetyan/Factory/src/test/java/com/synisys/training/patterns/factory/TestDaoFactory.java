package com.synisys.training.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestDaoFactory {

	@Test
	public void testRdbDAOFactory() {
		UserDao userDao = UserDaoFactory.getUserDao(PersistenceType.RELATIONAL_DATA_BASE);
		assertEquals("UserDAO must be RdbUserDAO!", RdbUserDao.class, userDao.getClass());
	}

	@Test
	public void testXmlDAOFactory() {
		UserDao userDao = UserDaoFactory.getUserDao(PersistenceType.XML);
		assertEquals("UserDAO must be XmlUserDAO!", XmlUserDao.class, userDao.getClass());
	}
}
