package com.api.models.request;

public class AddressDetails {
	
	private String firstname;
	private String lastname;
	private String location;
	private String email;
	private String phone;
	
public AddressDetails() {
	// TODO Auto-generated constructor stub
}

public AddressDetails(String firstname, String lastname, String location, String email, String phone) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.location = location;
	this.email = email;
	this.phone = phone;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "AddressDetails [firstname=" + firstname + ", lastname=" + lastname + ", location=" + location + ", email="
			+ email + ", phone=" + phone + "]";
}

public static class Builder
{
	private String firstname;
	private String lastname;
	private String location;
	private String email;
	private String phone;
	
	public Builder firstname(String firstname)
	{
		this.firstname=firstname;
		return this;
	}
	
	public Builder lastname(String lastname)
	{
		this.lastname=lastname;
		return this;
	}
	
	public Builder location(String location)
	{
		this.location=location;
		return this;
	}
	
	public Builder email(String email)
	{
		this.email=email;
		return this;
	}
	
	public Builder phone(String phone)
	{
		this.phone=phone;
		return this;
	}
	
	public AddressDetails build()
	{
		AddressDetails addressDetails = new AddressDetails(firstname, lastname, location, email, phone);
		return addressDetails;
	}
}

}
