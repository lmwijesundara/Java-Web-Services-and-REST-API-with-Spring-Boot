package com.lahiru.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	  
	private Integer id;
	private String name;
	private Date birthDay;
	
	
	
	protected User() {
	}

	public User(Integer id, String name, Date birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDay=" + birthDay + "]";
	}
	
	
	

}
