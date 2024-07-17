package StringCancepts;

public class StringClassExample {

	public static void main(String[] args) {
		
		String str=new String("Capgemini");
		                   //  0,1,2,3,4,5,6,7,8
		System.out.println("Original String is::"+str);
	
		//Length of the string
		
		System.out.println("Length of the given string is::"+str.length());
		
		//IndexOf the String
		
		System.err.println("Index of the given string is::"+str.indexOf("p"));
		//CharAt of teh String
		
		System.out.println("Character of the given string is::"+str.charAt(0));
		//ToUpperCase of the String
		
		System.err.println("ToUppercase of the given string is::"+str.toUpperCase());
		
		
		//ToLowerCase Of The String
		
		System.out.println("ToLowercase of the given string is::"+str.toLowerCase());
		
		//Replace of the String
		
		System.out.println("Replace the old string to new String  is::"+str.replace(str, "Technology"));
		
		
		//Trim method of the string
		
		System.out.println("Remove white spaces of the given string is::"+str.trim());
		//Concat of the String
		
		System.err.println("Concat of the given string is::"+str.concat("Technology"));
		
		//Equals of the String
		System.out.println("Equals of the given string is::"+str.equals("Capgemini"));
		
		
		//EqualIgnoreCase of the String
		
		System.out.println("Equalignorecase of the given string is::"+str.equalsIgnoreCase("CapGemIni"));
		
		//Contains of the String
		
		System.out.println("Contains of the given string is::"+str.contains("Technology"));
		
		//substring  of the String
		
		System.out.println("SubString of the given string is::"+str.substring(5));
	}

}
