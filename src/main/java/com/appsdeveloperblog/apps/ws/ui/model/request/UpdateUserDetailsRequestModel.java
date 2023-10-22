package com.appsdeveloperblog.apps.ws.ui.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotEmpty(message = "First name cannot be null")
	@Size(min = 2, message = "Size must be at least 2 Characters")
	private String firstName;

	@NotEmpty(message = "Last name cannot be null")
	private String lastName;

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

}
