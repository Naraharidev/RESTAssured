package testAPIMethods;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import dataFiles.Post_Method_Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_Patch {
	@Test
	public void patchDetails() throws Exception {
		RestAssured.baseURI = ApiDetails.URL;
		Response response = given().header("Content-type", "application/json").and().body(Post_Method_Body.getBody())
				.when().patch(ApiDetails.patchEmployeeResource).then().extract().response();
		Assert.assertEquals(200, response.statusCode());
		String patchResponse = response.asString();
		JsonPath js = ReusableMethods.getJsonFormatResponse(patchResponse);
		StoreResponses.writePatchResponse(js);
	}

}
