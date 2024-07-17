package JavaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapExample {
	
	public static void main(String[] args) {
        
        Map<String,Object> myMap=new HashMap<String,Object>();
        // Adding key-value pairs to the hashmap
        myMap.put("name", "John");
        myMap.put("age", 25);
        myMap.put("city", "New York");

        
        for(Entry<String, Object> entry:myMap.entrySet()) {
        	 System.err.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        
        // Iterating over keys using a for loop
        System.out.println("Iterating over keys using a for loop:");
        for (String key : myMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + myMap.get(key));
        }

	}
}
