package stepDefinitions;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utilities;


public class StepDefinition extends Utilities {
	
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;
	JsonPath js;
	TestDataBuild tdb = new TestDataBuild();
	Utilities ut = new Utilities();
	
	@Given("Add Place Payload")
	public void add_place_payload() {
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		res = RestAssured.given().spec(ut.requestSpecification()).body(tdb.addPlacePayload());
	}
	
	@When("user calls {string} with Post http request")
	public void user_calls_with_post_http_request(String string) {
		response = res.when().post("/maps/api/place/add/json").
				then().spec(resspec).extract().response();
	}
	@Then("the API call is success with status code {int}")
	public void the_apı_call_is_success_with_status_code(Integer int1) {
		
		assertEquals(response.getStatusCode(),200);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedValue) {
	    String resp = response.asString();
	    
	    JsonPath js = new JsonPath(resp);
	    assertEquals(js.get(keyValue).toString(), expectedValue);
	}


}
