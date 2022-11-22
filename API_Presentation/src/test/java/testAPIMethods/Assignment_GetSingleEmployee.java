package testAPIMethods;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_GetSingleEmployee {

	@Test
	public void getSingleEmployee() throws Exception {
		RestAssured.baseURI = ApiDetails.URL;
		
		String response = given().log().all().header("Content-Type", "application/json")
				.when().get(ApiDetails.getSingleEmployeeResource)
				.then().assertThat().statusCode(200).extract().response().asString();

		JsonPath jp = ReusableMethods.getJsonFormatResponse(response);
		StoreResponses.writeGetSingleResponse(jp);
	}

}
