package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserVerifyRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { //wrapper for RestAssured

	//base uri
	//creating the request
	//handling the response
	private static final String BASE_URL = "https://grest.agbe.in";
	
	//instance variable
	private RequestSpecification rs;
	
	static{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService() {
	     rs = given().baseUri(BASE_URL);
	}
	protected Response postRequest(Object loginRequest,String endpoint)
	{
		return rs.contentType(ContentType.JSON).body(loginRequest).post(endpoint);
	}
    protected Response postRequestWithAuth(Object requestPayload, String endpoint, String authToken) {
        return rs.contentType(ContentType.JSON)
                 .header("x-auth", authToken)
                 .body(requestPayload)
                 .post(endpoint);
    }
    protected Response putRequestWithAuth(Object requestPayLoad, String endpoint, String authToken)
    {
    	return rs.contentType(ContentType.JSON)
    			.header("x-auth",authToken)
    			.body(requestPayLoad)
    			.put(endpoint);
    }
    protected Response getRequestWithAuth(String endpoint, String authToken)
    {
    	return rs.contentType(ContentType.JSON)
    			.header("x-auth",authToken)
    			.get(endpoint);
    }
}
