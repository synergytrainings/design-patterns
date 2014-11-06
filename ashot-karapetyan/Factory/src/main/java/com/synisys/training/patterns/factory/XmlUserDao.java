package com.synisys.training.patterns.factory;

import java.util.List;


public class XmlUserDao implements UserDao {
	@Override
	public List<User> loadUsers() {
		throw new UnsupportedOperationException();
	}

	@Override
	public User loadUser(int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int deleteUser(int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int UpdateUser(User user) {
		throw new UnsupportedOperationException();
	}
}
