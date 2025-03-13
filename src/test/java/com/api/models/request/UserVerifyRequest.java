package com.api.models.request;

public class UserVerifyRequest {
	
	private String phoneNo;
	private String otp;
	
	public UserVerifyRequest(String phoneNo, String otp) {
		super();
		this.phoneNo = phoneNo;
		this.otp = otp;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "UserVerifyRequest [phoneNo=" + phoneNo + ", otp=" + otp + "]";
	}
	
	//create builder class
	public static class Builder
	{
		private String phoneNo;
		private String otp;
		
		public Builder phoneNo(String phoneNo)
		{
			this.phoneNo = phoneNo;
			return this;
		}
		public Builder otp(String otp)
		{
			this.otp = otp;
			return this;
		}
		
		public UserVerifyRequest build()
		{
			UserVerifyRequest userVerifyRequest = new UserVerifyRequest(phoneNo, otp);
			return userVerifyRequest;
		}
	}

	

}
