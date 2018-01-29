package com.lahiru.rest.webservices.restfulwebservices.helloworld;

public class helloWorldBean {

	private String message;

	public helloWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("helloWorldBean [message=%s]", message);
	}

}
