package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	@Column(name = "userId")
	private int id;
	
	@Column(name = "firstName")
	private String first_name;
	
	@Column(name = "lastName")
	private String last_name;
	
	@Column(name = "userMail")
	private String mail;
	
	@Column(name = "pass")
	private String password;
	
	@Column(name = "confirmPass")
	private String confirm_password;
	
	@Column(name = "contact")
	private long mob;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	
	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	
	public User(int id, String first_name, String last_name, String mail, String password, String confirm_password,
			long mob) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mail = mail;
		this.password = password;
		this.confirm_password = confirm_password;
		this.mob = mob;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", mail=" + mail
				+ ", password=" + password + ", confirm_password=" + confirm_password + ", mob=" + mob + "]";
	}
	
	
	

	
	
}
