package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EditProfileAPITest {
	
	private String authToken;
	
	@Test(description = "Verify if the edit profile API is working")
	public void editProfile()
	{
		AuthService authService = new AuthService();
		authToken=authService.getAuthToken();
	
	System.out.println(authToken);
	SignUpRequest signUpRequest= new SignUpRequest.Builder()
			.name("Edit")
			.email("automation1@gmail.com")
			.shopname("api1")
			.pincode("200101")
			.build();
	
	//create request specification
	RestAssured.given()
	.header("x-auth", authToken.trim())
	.contentType("application/json")
	.body(signUpRequest);

	Response response = authService.editProfile(signUpRequest, authToken);
	System.out.println(response.asPrettyString());
}
}