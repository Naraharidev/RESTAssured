package testAPIMethods;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import dataFiles.Post_Method_Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_Post {

	@Test
	public void postDetails() throws Exception {

		RestAssured.baseURI = ApiDetails.URL;
		String postResponse = given().log().all().header("Content-Type", "application/json")
				.body(Post_Method_Body.getBody()).when().post(ApiDetails.postEmployeeResource).then().assertThat()
				.statusCode(201).extract().response().asString();

		JsonPath js = ReusableMethods.getJsonFormatResponse(postResponse);
		StoreResponses.writePostResponse(js);

	}

}
