package testAPIMethods;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import dataFiles.Put_Method_Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_Put {
	@Test
	public void putDetails() throws Exception {
		RestAssured.baseURI = ApiDetails.URL;
		String requestBody = Put_Method_Body.getBody();

		Response response = given().header("Content-type", "application/json").and().body(requestBody).when()
				.put(ApiDetails.putEmployeeResource).then().extract().response();

		Assert.assertEquals(200, response.statusCode());
		System.out.println(response.asString());
		String putResponse = response.asString();
		JsonPath js = ReusableMethods.getJsonFormatResponse(putResponse);
		StoreResponses.writePutResponse(js);

	}
}
