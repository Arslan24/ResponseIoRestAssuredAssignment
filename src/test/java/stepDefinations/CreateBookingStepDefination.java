package stepDefinations;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import helpers.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class CreateBookingStepDefination extends BaseStepDefinitions {
	public CreateBookingStepDefination(TestContext testContext) {
		super(testContext);
	}
	private static Response bookingDetails;

	@Given("Add booking payload with {string} {string} {string} {string} {string} {string} {string} booking api")
	public void add_Booking(String firstName, String lastName, String totalprice, String depositpaid, String checkin,
			String checkout, String additionalneeds) throws IOException {

		String DirectoryPath = System.getProperty("user.dir");

		try {

			int totalprice1 = Integer.parseInt(totalprice);
			boolean depositpaid1 = Boolean.parseBoolean(depositpaid);

			// create a map
			List<Map<String, Object>> array = new ArrayList<Map<String, Object>>();
			Map<String, Object> map = new HashMap<String, Object>();

			map.put("firstname", firstName);
			map.put("lastname", lastName);
			map.put("totalprice", totalprice1);
			map.put("depositpaid", depositpaid1);

			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("checkin", checkin);
			map1.put("checkout", checkout);
			array.add(map1);
			map.put("bookingdates", map1);
			map.put("additionalneeds", additionalneeds);

			ObjectMapper mapper = new ObjectMapper();
			// convert map to JSON file
			mapper.writeValue(Paths.get(DirectoryPath + "/src/test/resources/data/CreateBookingPayload.json").toFile(),
					map);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@When("the user {string} for create a booking api")
	public void user_Send_Request(String req) throws IOException {
		System.out.println("Call booking api");
		bookingDetails = getEndPoints().addBooking();
		System.out.println(req + " Booking Details data: " + bookingDetails.asString());
	}

	@Then("the API call is success with status code {int}")
	public void api_call_success(Integer int1) {
				
		Assert.assertEquals(200, bookingDetails.getStatusCode());
		System.out.println("api response is 200 & verified");
	}

}
