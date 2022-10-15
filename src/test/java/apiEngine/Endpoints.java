package apiEngine;

import java.io.IOException;

import helpers.CreateBookingPayload;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Endpoints {

	private final RequestSpecification request;

	public Endpoints(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}
	
    public  Response addBooking() throws IOException {
    	CreateBookingPayload createBookingpa = new CreateBookingPayload();
        Response response =  request.body(createBookingpa.CreateBookingPayload("correct","baseUrl")).when().post(Route.CreateBooking());
     
        return response;
    }

}
