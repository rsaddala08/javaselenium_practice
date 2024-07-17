package JavaPrograms;

public class EvenCharacters {

	public static void main(String[] args) {
		  String inputString = "HelloWorld"; // Replace with your desired string
	        printEvenCharacters(inputString);
	    }

	    private static void printEvenCharacters(String str) {
	        StringBuilder evenChars = new StringBuilder();

	        for (int i = 1; i < str.length(); i += 2) {
	            evenChars.append(str.charAt(i));
	        }

	        System.out.println("Even-positioned characters: " + evenChars);
	    }
	    
	    //For ODD characters "I" value is "0"
	    
}
