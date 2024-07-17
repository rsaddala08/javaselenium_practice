package apiTest;

import java.io.FileReader;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class JsonReadAndWrite {
	
	@Test
	public void readJson() {
		try {
			JSONParser parser = new JSONParser();

			
			Object obj = parser.parse(new FileReader("C:\\Users\\rajess\\OneDrive - Capgemini\\Desktop\\New folder\\Documents Folder\\CoreJavaTopics\\Files\\cpp.json"));
			
			JSONObject jsonObject =  (JSONObject) obj;
			
			
			JSONObject json =jsonObject.getJSONObject("account").getJSONObject("phone");
			
			System.out.println(json.toString());
			
			
			
			
		}catch(Throwable t) {
			System.out.println(t.getMessage());
		}
	}

}
