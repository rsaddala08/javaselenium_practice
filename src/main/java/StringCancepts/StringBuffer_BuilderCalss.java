package StringCancepts;

public class StringBuffer_BuilderCalss {

	public static void main(String[] args) {
	
		StringBuffer sbObject=new StringBuffer("Capgemini");// String buffer initialization
		
		//StringBuilder sbObject=new StringBuilder("Capgemini");// String builder initialization
		
		
		//APPEND --> To add one string to another string using append method
		
		System.out.println("Append String is:: "+sbObject.append(" Technology") );
		
		
		//INSERT --> To add the extra charectors/Strings in teh given string
		
		System.err.println("Insert of String is:::::"+sbObject.insert(2, "$"));
		
		//DELETE --> To delete the  given string based on the position given by user
		
		System.err.println("Delete string is:::::"+sbObject.delete(3, 6));
		
		//REVERSE-- To reverse of the given string
		System.err.println("Reverse string is:::::"+sbObject.reverse());
		
		//REPLACE - replace (start index, end index, string value)
		
		System.err.println("Reverse string is:::::"+sbObject.reverse());
		
		System.out.println("Replace string is:::::"+sbObject.replace(4, 10, "*****@@@@@@****"));
		
		System.out.println("Append String is:: "+sbObject.append(" Technology") );
		
		//LENGTH--> To return the size of the given string
		System.out.println("Length of the given string is::"+sbObject.length());
		
		//CharAT
		
		System.out.println("Character of the given string is::"+sbObject.charAt(20));
		
		//SubSequence
		
		System.out.println("SubSequence of the given string is::"+sbObject.subSequence(10, 20));
		
		
	}

}
