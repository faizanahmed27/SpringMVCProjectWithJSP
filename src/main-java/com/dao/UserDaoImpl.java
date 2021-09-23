package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void addUser(User user) {
		
		System.out.println("User method");
		
		this.hibernateTemplate.saveOrUpdate(user);
	}

	public List<User> getUsers() {
		
		List<User> userList = this.hibernateTemplate.loadAll(User.class);
		return userList;
	}

	public void deleteUser(int userId) {
		
		User user = this.hibernateTemplate.load(User.class, userId);
		this.hibernateTemplate.delete(user);
	}

	public User getUser(int userId) {
		
		return this.hibernateTemplate.get(User.class, userId);
	}

	public boolean loginUser(final User user) {
		// TODO Auto-generated method stub
		 System.out.println("Checking the user in the database");
	        boolean isValidUser = false;
	        String sqlQuery = "select u from User u where u.mail = ? and u.confirm_password  = ? ";
	        try {
	             List<User> find = (List<User>) hibernateTemplate.find(sqlQuery, user.getMail(), user.getConfirm_password());
	            System.out.println("userObje : "+find);
            if(find != null && find.size() > 0) {
	                System.out.println(" Name= " + find.get(0).getMail() + ", Password= " + find.get(0).getConfirm_password());
	                isValidUser = true;
	            }
	        } catch(Exception e) {
	            isValidUser = false;
	            System.out.println("An error occurred while fetching the user details from the database"); 
	            e.printStackTrace();
	        }
			return isValidUser;
	}

}
