package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SignUpAPITest {
	
	private String authToken;
	
	@Test(description = "Verify whether the create-user api is working")
	
	public void SignUpTest()
	{
		//use case of builder class - dont need to define complicated constructor.
		
		SignUpRequest signUpRequest= new SignUpRequest.Builder()
		.name("Demo Test")
		.email("automation@gmail.com")
		.shopname("api")
		.pincode("200100")
		.build();
		
		//authenticate and get token
		AuthService authService = new AuthService();
		authToken = authService.getAuthToken();
		
		System.out.println("Debug: Retrieved Auth Token -> " + authToken);
		// Check if token is valid
        if (authToken == null || authToken.isEmpty()) {
            throw new RuntimeException("Auth token not received. Test cannot proceed.");
        }
        System.out.println("Auth Token: " + authToken);
		//create Request Specification
        RestAssured.given()
        		.header("x-auth", authToken.trim())
        	    .contentType("application/json")
        	    .body(signUpRequest);
                 
		
		//call SignUp API
		Response response = authService.signUp(signUpRequest, authToken);
		System.out.println(response.asPrettyString());
	}

}
