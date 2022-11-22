package testAPIMethods;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_Delete {
	@Test
	public void deleteRequest() throws Exception {
		// DELETE request is used to delete a resource from a server. delete()
		RestAssured.baseURI = ApiDetails.URL;
		Response response = given().header("Content-type", "application/json").when()
				.delete(ApiDetails.deleteEmployeeResource).then().extract().response();

		Assert.assertEquals(200, response.statusCode());
		
		String str = response.asString();
		JsonPath js = ReusableMethods.getJsonFormatResponse(str);
		StoreResponses.writeDeleteResponse(js);
	}
}
