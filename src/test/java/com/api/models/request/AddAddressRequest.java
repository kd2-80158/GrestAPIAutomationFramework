package com.api.models.request;

public class AddAddressRequest {
	
	private AddressDetails billingAddress;
	private AddressDetails shippingAddress;
	
	public AddAddressRequest() {
		// TODO Auto-generated constructor stub
	}
	
	

	public AddAddressRequest(AddressDetails billingAddress, AddressDetails shippingAddress) {
		super();
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}



	public AddressDetails getBillingAddress() {
		return billingAddress;
	}

	public AddressDetails getShippingAddress() {
		return shippingAddress;
	}
	
	

}
