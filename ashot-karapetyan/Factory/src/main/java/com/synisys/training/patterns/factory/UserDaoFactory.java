package com.synisys.training.patterns.factory;


public class UserDaoFactory {

	public static UserDao getUserDao(PersistenceType persistenceType) {
		switch (persistenceType) {
			case RELATIONAL_DATA_BASE:
				return new RdbUserDao();
			case XML:
				return new XmlUserDao();
			default:
				throw new IllegalArgumentException(String.format("Unsupported persistence type %s", persistenceType));
		}
	}
}
