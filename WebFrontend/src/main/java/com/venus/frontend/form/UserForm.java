package com.venus.frontend.form;

import org.hibernate.validator.constraints.NotEmpty;

import com.venus.common.dto.UserDto;

public class UserForm extends UserDto {

	@NotEmpty
	private String confirmPassword;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	private Boolean adminRole;

	public Boolean getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(Boolean adminRole) {
		this.adminRole = adminRole;
	}
}
