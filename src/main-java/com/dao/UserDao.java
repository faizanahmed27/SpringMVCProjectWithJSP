package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	void addUser(User user);
	
	List<User> getUsers();
	
	void deleteUser(int userId);
	
	User getUser(int userId);
	
   boolean loginUser(final User user);

}
