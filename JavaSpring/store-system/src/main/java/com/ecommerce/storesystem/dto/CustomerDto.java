package com.ecommerce.storesystem.dto;

import java.util.Date;

public class CustomerDto extends BaseDto {
	private String fullName;
	private String phone;
	private String address;
	private Date birthday;
	private Long accountId;

	public CustomerDto() {
		super();
	}

	public CustomerDto(String fullName, String phone, String address, Date birthday, Long accountId) {
		super();
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.accountId = accountId;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

}
