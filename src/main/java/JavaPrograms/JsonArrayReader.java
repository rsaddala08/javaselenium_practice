package JavaPrograms;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonArrayReader {

	 public static void main(String[] args) {
	        // Replace jsonString with your JSON array string
	        String jsonString = "[{\"name\":\"John\",\"age\":25,\"city\":\"New York\"},{\"name\":\"Alice\",\"age\":30,\"city\":\"London\"}]";

	        try {
	            // Create an ObjectMapper
	            ObjectMapper objectMapper = new ObjectMapper();

	            // Read JSON array as JsonNode
	            JsonNode jsonNode = objectMapper.readTree(jsonString);

	            // Check if it's an array
	            if (jsonNode.isArray()) {
	                // Iterate through array elements
	                for (JsonNode record : jsonNode) {
						/*
						 * // Iterate through key-value pairs in each record for (String fieldName :
						 * record.fieldNames()) { System.out.println(fieldName + ": " +
						 * record.get(fieldName).asText()); }
						 */
	                    System.out.println(); // Separate records with an empty line
	                }
	            } else {
	                System.out.println("Not a valid JSON array");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

