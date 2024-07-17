package JavaPrograms;

public class OvelsAndConso {
	 public static void main(String[] args) {    
	            
	        //Counter variable to store the count of vowels and consonant    
	        int vCount = 0, cCount = 0;    
	            
	        //Declare a string    
	        String str = "This is a really simple sentence";  
	        
	        StringBuilder vol = new StringBuilder();
	        StringBuilder cons = new StringBuilder();
	            
	        //Converting entire string to lower case to reduce the comparisons    
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	                vCount++;    
	                vol.append(str.charAt(i)).append(" ");
	            }    
	            //Checks whether a character is a consonant    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                cCount++;    
	                cons.append(str.charAt(i)).append(" ");
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);
	        
	        System.out.println("vowels: " + vol);    
	        System.out.println("consonants: " + cons);
	    }    
	
}
