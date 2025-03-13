package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserVerifyRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {
	
	@Test(description="Verify if Login API is working...")
	public void loginTest()
	{
		/*Rest Assured is a class so we need to create an object ? No, all the methods
		 and variables are static in nature. This is not a normal class, this is a utility
		 class
		 */
//		RestAssured.baseURI = "https://grest.agbe.in";
//		RequestSpecification rs = RestAssured.given();
//		RequestSpecification h = rs.header("Content-Type","application/json");
//		RequestSpecification b = h.body("{\"phoneNo\":\"8810619472\"}");
//		Response response = b.post("/api/user-login");
//		System.out.println(response.asPrettyString());
		AuthService authService = new AuthService();
		LoginRequest loginRequest = new LoginRequest("8810619472");
		Response response = authService.login(loginRequest);
//		String otp=response.jsonPath().getString("otp");
//		
//		System.out.println("OTP is: "+otp);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		
	}

}
