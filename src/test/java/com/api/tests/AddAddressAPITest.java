package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.AddAddressRequest;
import com.api.models.request.AddressDetails;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AddAddressAPITest {
	
	private String authToken;
	
	@Test(description="Verify whether the Add Address API is working...")
	public void addAddress()
	{
		
		
		AuthService authService = new AuthService();
		LoginRequest loginRequest = new LoginRequest("8810619472");
		authToken = authService.getAuthToken();
		
		System.out.println("Auth token received: "+authToken);
		
		//creating billing address and shipping address 
		AddressDetails billingAddress = new AddressDetails.Builder()
				.firstname("Tester J")
				.lastname("Foster")
				.location("California")
				.email("testerj@gmail.com")
				.phone("9990000100")
				.build();
		
		AddressDetails shippingAddress = new AddressDetails.Builder()
				.firstname("Tester K")
				.lastname("Ben")
				.location("New York")
				.email("testerk@gmail.com")
				.phone("8880000800")
				.build();
		
		//create add address request
		AddAddressRequest addAddressRequest = new AddAddressRequest(billingAddress,shippingAddress);
		
		RestAssured.given()
		.header("x-auth", authToken)
		.contentType("application/json")
		.body(addAddressRequest);
		
		Response response=authService.addAddress(addAddressRequest, authToken);
		System.out.println(response.asPrettyString());
	}

}
