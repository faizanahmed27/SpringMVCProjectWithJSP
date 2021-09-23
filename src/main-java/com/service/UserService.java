package com.service;

import java.util.List;

import com.model.User;

public interface UserService {

	void addUser(User user);
	
	List<User> getUsers();
	
	void deleteUser(int userId);
	
	User getUser(int userId);
	
	public boolean loginUser(final User user);
}


