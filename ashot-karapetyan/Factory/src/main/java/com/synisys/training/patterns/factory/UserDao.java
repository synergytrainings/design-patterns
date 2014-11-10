package com.synisys.training.patterns.factory;

import java.util.List;

public interface UserDao {

	List<User> loadUsers();

	User loadUser(int id);

	int deleteUser(int id);

	int UpdateUser(User user);
}
