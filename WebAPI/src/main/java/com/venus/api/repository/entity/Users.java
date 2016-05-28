package com.venus.api.repository.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
(name = "venus_user")
public class Users {

	@Id
	@Column(name="user_id")
	private long userId;
	
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="sex")
	private int sex;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="avatar_path")
	private String avatarPath;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_expired_date")
	private String passwordExpiredDate;
	
	@Column(name="last_login_date")
	private String lastLoginDate;
	
	@Column(name="number_try_login")
	private int numberTryLogin;
	
	@Column(name="is_actived")
	private int isActived;
	
	@Column(name="is_locked")
	private int isLocked;
	
	@Column(name="is_deleted")
	private int isDeleted;
	
	@Column(name="create_user_id")
	private long createUserId;
	
	@Column(name="create_date")
	private String createDate;
	
	@Column(name="last_modified_user_id")
	private long lastModifiedUserId;
	
	@Column(name="last_modified_date")
	private String lastModifiedDate;
	
	@ManyToMany
	@JoinTable(name = "venus_user_role", joinColumns = @JoinColumn(name = "user_id"), 
			inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Roles> roles = new ArrayList<Roles>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAvatarPath() {
		return avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getPasswordExpiredDate() {
		return passwordExpiredDate;
	}

	public void setPasswordExpiredDate(String passwordExpiredDate) {
		this.passwordExpiredDate = passwordExpiredDate;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public int getNumberTryLogin() {
		return numberTryLogin;
	}

	public void setNumberTryLogin(int numberTryLogin) {
		this.numberTryLogin = numberTryLogin;
	}

	public int isActived() {
		return isActived;
	}

	public void setActived(int isActived) {
		this.isActived = isActived;
	}

	public int isLocked() {
		return isLocked;
	}

	public void setLocked(int isLocked) {
		this.isLocked = isLocked;
	}

	public int isDeleted() {
		return isDeleted;
	}

	public void setDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public long getLastModifiedUserId() {
		return lastModifiedUserId;
	}

	public void setLastModifiedUserId(long lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
	
}
