package testAPIMethods;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import dataFiles.ApiDetails;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ReusableMethods;
import utilities.StoreResponses;

public class Assignment_GetAllEmployees {

	@Test
	public void GetAllEmployees() throws Exception {
		RestAssured.baseURI = ApiDetails.URL;
		Response response = given().log().all().header("Content-Type", "application/json").when()
				.get(ApiDetails.getAllEmployeeResource).then().assertThat().statusCode(200).extract().response();
		System.out.println(response.getStatusCode());
		String getRes=response.asString();
		JsonPath jp = ReusableMethods.getJsonFormatResponse(getRes);
		StoreResponses.writeGetAllResponse(jp);

	}

}
