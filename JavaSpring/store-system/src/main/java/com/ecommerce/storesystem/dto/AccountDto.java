package com.ecommerce.storesystem.dto;


public class AccountDto extends BaseDto{
	private String userName;

    private String password;
	
	private String fullName;
	
	private String phone;
	
	private String address;
	
	private String birthday;
	
	private Long roleId;

	public AccountDto() {
		super();
	}

	public AccountDto(String userName, String password, String fullName, String phone, String address, String birthday,
			Long roleId) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	
    
}