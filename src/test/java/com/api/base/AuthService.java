package com.api.base;

import java.util.HashMap;

import com.api.models.request.AddAddressRequest;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import com.api.models.request.UserVerifyRequest;

import io.restassured.response.Response;

//authentication service
public class AuthService extends BaseService {
	
	private static final String BASE_PATH = "/api/";

	public String getAuthToken() {
	    UserVerifyRequest userVerifyRequest = new UserVerifyRequest.Builder()
	        .phoneNo("8810619472")
	        .otp("8436")
	        .build();

	    Response response = userverify(userVerifyRequest);

	    // Print the response for debugging
	    System.out.println("Auth Response: " + response.asPrettyString());

	    // Extract token safely
	    String token = response.jsonPath().getString("token");

	    if (token == null || token.isEmpty()) {
	        throw new RuntimeException("Auth token not received. Response: " + response.asPrettyString());
	    }
	    else
	    	System.out.println("token received!!!!!!!!!!");

	    return token;
	}
	

	//sending a login request to API
	public Response login(LoginRequest loginRequest)
	{
		return postRequest(loginRequest, BASE_PATH+"user-login");
	}
	//sending OTP verification request to API
	public Response userverify(UserVerifyRequest userVerifyRequest)
	{
		return postRequest(userVerifyRequest, BASE_PATH+"user-verify");
	}
	//sending a signup request to create new user
	public Response signUp(SignUpRequest payload, String authToken) 
	{
		// TODO Auto-generated method stub
		return postRequestWithAuth(payload, BASE_PATH+"createUser", authToken);
			
	}
	//sending a edit profile request to API
	public Response editProfile(SignUpRequest payload,String authToken)
	{
		return putRequestWithAuth(payload, BASE_PATH+"updateUser", authToken);
	}


	public Response getUser(String authToken) {
		// TODO Auto-generated method stub
		return getRequestWithAuth(BASE_PATH+"getUser", authToken);
	}


	public Response addAddress(AddAddressRequest payload, String authToken) {
		// TODO Auto-generated method stub
		return postRequestWithAuth(payload, BASE_PATH+"addAddres", authToken);
	}
	}

