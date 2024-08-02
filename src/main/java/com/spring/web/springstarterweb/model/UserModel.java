package com.spring.web.springstarterweb.model;


import lombok.Data;

@Data
public class UserModel {
	public String userText;

	public String getUserText() {
		return userText;
	}

	public void setUserText(String userText) {
		this.userText = userText;
	}
	
	
}
