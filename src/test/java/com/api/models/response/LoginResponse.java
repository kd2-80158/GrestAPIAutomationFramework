package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class LoginResponse {
    private boolean status;
    private String token;
    private String message;
    private Data data;
    private boolean userState;
    private String otp;

    public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	// Default Constructor
    public LoginResponse() {}


    public LoginResponse(boolean status, String token, String message, Data data, boolean userState, String otp) {
		super();
		this.status = status;
		this.token = token;
		this.message = message;
		this.data = data;
		this.userState = userState;
		this.otp = otp;
	}

	// Getters and Setters
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Data getData() { return data; }
    public void setData(Data data) { this.data = data; }

    public boolean isUserState() { return userState; }
    public void setUserState(boolean userState) { this.userState = userState; }

	@Override
	public String toString() {
		return "LoginResponse [status=" + status + ", token=" + token + ", message=" + message + ", data=" + data
				+ ", userState=" + userState + ", otp=" + otp + "]";
	}


}
@JsonIgnoreProperties(ignoreUnknown = true)
class Data {
    private String name;
    private String id;
    private String shopname;
    private String phone;
    private String email;
    private boolean isKycComplete;
    private boolean isKycSubmitted;
    private List<Address> address;

    // Default Constructor
    public Data() {}

    // Parameterized Constructor
    public Data(String name, String id, String shopname, String phone, String email, boolean isKycComplete, 
                boolean isKycSubmitted, List<Address> address) {
        this.name = name;
        this.id = id;
        this.shopname = shopname;
        this.phone = phone;
        this.email = email;
        this.isKycComplete = isKycComplete;
        this.isKycSubmitted = isKycSubmitted;
        this.address = address;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getShopname() { return shopname; }
    public void setShopname(String shopname) { this.shopname = shopname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isKycComplete() { return isKycComplete; }
    public void setKycComplete(boolean isKycComplete) { this.isKycComplete = isKycComplete; }

    public boolean isKycSubmitted() { return isKycSubmitted; }
    public void setKycSubmitted(boolean isKycSubmitted) { this.isKycSubmitted = isKycSubmitted; }

    public List<Address> getAddress() { return address; }
    public void setAddress(List<Address> address) { this.address = address; }

    @Override
    public String toString() {
        return "Data [name=" + name + ", id=" + id + ", shopname=" + shopname + ", phone=" + phone + ", email=" + email
                + ", isKycComplete=" + isKycComplete + ", isKycSubmitted=" + isKycSubmitted + ", address=" + address + "]";
    }
}

class Address {
    private String _id;
    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;

    // Default Constructor
    public Address() {}

    // Parameterized Constructor
    public Address(String _id, ShippingAddress shippingAddress, BillingAddress billingAddress) {
        this._id = _id;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    // Getters and Setters
    public String get_id() { return _id; }
    public void set_id(String _id) { this._id = _id; }

    public ShippingAddress getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(ShippingAddress shippingAddress) { this.shippingAddress = shippingAddress; }

    public BillingAddress getBillingAddress() { return billingAddress; }
    public void setBillingAddress(BillingAddress billingAddress) { this.billingAddress = billingAddress; }

    @Override
    public String toString() {
        return "Address [_id=" + _id + ", shippingAddress=" + shippingAddress + ", billingAddress=" + billingAddress + "]";
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class ShippingAddress {
    private String firstname;
    private String lastname;
    private String location;
    private String pincode;
    private String completeAddress;
    private String email;
    private String phone;

    // Default Constructor
    public ShippingAddress() {}

    // Parameterized Constructor
    public ShippingAddress(String firstname, String lastname, String location, String pincode, String completeAddress,
                           String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.pincode = pincode;
        this.completeAddress = completeAddress;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getCompleteAddress() { return completeAddress; }
    public void setCompleteAddress(String completeAddress) { this.completeAddress = completeAddress; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "ShippingAddress [firstname=" + firstname + ", lastname=" + lastname + ", location=" + location
                + ", pincode=" + pincode + ", completeAddress=" + completeAddress + ", email=" + email + ", phone=" + phone + "]";
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class BillingAddress {
    private String firstname;
    private String lastname;
    private String location;
    private String pincode;
    private String completeAddress;
    private String email;
    private String phone;

    // Default Constructor
    public BillingAddress() {}

    // Parameterized Constructor
    public BillingAddress(String firstname, String lastname, String location, String pincode, String completeAddress,
                          String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.pincode = pincode;
        this.completeAddress = completeAddress;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getCompleteAddress() { return completeAddress; }
    public void setCompleteAddress(String completeAddress) { this.completeAddress = completeAddress; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "BillingAddress [firstname=" + firstname + ", lastname=" + lastname + ", location=" + location
                + ", pincode=" + pincode + ", completeAddress=" + completeAddress + ", email=" + email + ", phone=" + phone + "]";
    }
}
