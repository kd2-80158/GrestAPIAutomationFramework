package com.api.models.request;

public class SignUpRequest {
	
	private String name;
	private String shopname;
	private String email;
	private String pincode;
	
	public SignUpRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public SignUpRequest(String name, String shopname, String email, String pincode) {
		super();
		this.name = name;
		this.shopname = shopname;
		this.email = email;
		this.pincode = pincode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "SignUpRequest [name=" + name + ", shopname=" + shopname + ", email=" + email + ", pincode=" + pincode
				+ "]";
	}

	//creating a builder class - implementing builder class method
	//builder class - should be inner class, having same instance variables and the class will be static

	public static class Builder
	{
		private String name;
		private String shopname;
		private String email;
		private String pincode;
		
		public Builder name(String name)
		{
			this.name=name;
			 //Builder x = this;
			//Builder x = new Builder();-->does not give current object; initalise constructor by creating new object-->not required
			return this;//return the current object
		}
		public Builder shopname(String shopname)
		{
			this.shopname=shopname;
		    return this;//return the current object
		}
		public Builder email(String email)
		{
			this.email=email;
			return this;//return the current object
		}
		public Builder pincode(String pincode)
		{
			this.pincode=pincode;
			return this;//return the current object
		}

		public SignUpRequest build()
		{
			SignUpRequest signUpRequest = new SignUpRequest(name, shopname, email, pincode);
		    return signUpRequest;
		}
	}
}
