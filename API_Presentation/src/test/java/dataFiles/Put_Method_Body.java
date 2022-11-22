package dataFiles;

public class Put_Method_Body {
	public static String getBody() {
		String requestBody = "{\n" +
 	            "  \"title\": \"foo\",\n" +
 	            "  \"body\": \"baz\",\n" +
 	            "  \"userId\": \"1\",\n" +
 	            "  \"id\": \"1\" \n}";
		return  requestBody;
	}
}
