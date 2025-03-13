package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.UserVerifyRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class LoginUserVerify {
	
	@Test(description="Verify whether the user is verified...")
	public void userVerify()
	{
//		Response response = given().baseUri("https://grest.agbe.in")
//				.header("Content-Type","application/json")
//				                   .body("{\"phoneNo\":\"8810619472\",\"otp\":\"7652\"}")
//				                   .post("/api/user-verify");
//		System.out.println(response.asPrettyString());
//		
//		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		UserVerifyRequest userVerifyRequest = new UserVerifyRequest("8810619472","6330");
		AuthService authService = new AuthService();
		Response response = authService.userverify(userVerifyRequest);
		
		//deserialize JSON response into POJO
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.isStatus());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.isStatus(), true);
	}

}
