package com.api.models.request;

public class LoginRequest {
	
	private String phoneNo;

	@Override
	public String toString() {
		return "LoginRequest [phoneNo=" + phoneNo + "]";
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LoginRequest(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}

}
