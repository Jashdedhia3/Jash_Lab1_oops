package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface Credential {
	
	public String generateEmailAddress(String fName, String lName, String dept);

	// public String generatePassword();

	// public void showCredentials(Employee emp, String email, String pass);

	public void showCredentials(Employee emp, String email);

	
	

}
