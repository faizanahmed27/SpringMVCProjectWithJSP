package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.dao.UserDao;
import com.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	public List<User> getUsers() {
		
		return userDao.getUsers();
	}

	public void deleteUser(int userId) {
		
		userDao.deleteUser(userId);
		
	}

	public User getUser(int userId) {
		
		return userDao.getUser(userId);
	}

	public boolean loginUser(final User user) {
		// TODO Auto-generated method stub
		return userDao.loginUser(user);
	}
	
	

}
