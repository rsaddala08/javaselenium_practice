package JavaPrograms;

public class PalindromeString {
	public static void main(String args[])  
	   {  
	      String original="SRS", reverse = ""; // Objects of String class  
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome."+ reverse);  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
	}  

