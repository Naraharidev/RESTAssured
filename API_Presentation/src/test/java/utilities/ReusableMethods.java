package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static JsonPath getJsonFormatResponse(String response) {
		JsonPath jp = new JsonPath(response);
		return jp;
	}
	
	public static void writeMethod(JsonPath jp, String path) throws IOException {
		FileWriter filewriter = new FileWriter(new File(path));
		filewriter.write(jp.prettyPrint());
		filewriter.flush();
		filewriter.close();

}
}
