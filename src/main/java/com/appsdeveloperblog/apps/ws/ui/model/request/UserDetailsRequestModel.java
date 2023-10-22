package com.appsdeveloperblog.apps.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	// Hibernate Bean Validation Constraints.
	
	@NotEmpty(message = "First name cannot be null")
	@Size(min = 2, message = "Size must be at least 2 Characters")
	private String firstName;

	@NotEmpty(message = "Last name cannot be null")
	private String lastName;

	@NotEmpty(message = "Email cannot be null")
	@Email
	private String email;

	@NotEmpty(message = "Password cannot be null")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
