package utilities;

import java.io.IOException;

import dataFiles.FileDetails;
import io.restassured.path.json.JsonPath;

public class StoreResponses {
	
	public static void writePostResponse(JsonPath jp) throws Exception { 
		String path = FileDetails.postEmployeePath;
		ReusableMethods.writeMethod(jp,path);
	}
	
	public static void writeGetAllResponse(JsonPath jp) throws Exception { 
		String path = FileDetails.getAllEmployeePath;
		ReusableMethods.writeMethod(jp,path);
	}
	
	public static void writeGetSingleResponse(JsonPath jp) throws Exception {
		String path = FileDetails.getSingleEmployeePath;
		ReusableMethods.writeMethod(jp,path);
	}
	
	public static void writePutResponse(JsonPath jp) throws Exception {
		String path = FileDetails.putEmployeePath;
		ReusableMethods.writeMethod(jp,path);
	}
	public static void writeDeleteResponse(JsonPath jp) throws Exception {
		String path = FileDetails.deleteEmployeePath;
		ReusableMethods.writeMethod(jp,path);
	}

	public static void writePatchResponse(JsonPath jp) throws IOException {
		String path = FileDetails.patchEmployeePath;
		ReusableMethods.writeMethod(jp,path);
		
	}

}
