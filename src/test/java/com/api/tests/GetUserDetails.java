package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class GetUserDetails {

	private String authToken;

	@Test(description = "Verify if the get-user-by-phone-number API is working")
	public void getUser() {

		AuthService authService = new AuthService();
		authToken = authService.getAuthToken();

		RestAssured.given().header("x-auth", authToken).contentType("application/json");

		Response response = authService.getUser(authToken);
		System.out.println("GetUser: " + response.asPrettyString());
	}

}
