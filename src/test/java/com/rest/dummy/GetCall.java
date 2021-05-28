package com.rest.dummy;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
	
		//Request body
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response Object
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("response body is:"+responseBody );
		
		//status code validation
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
		
	}

}
