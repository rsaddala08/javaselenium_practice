package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s = "madam";
		//char c = s.charAt(6);
		String rev = "";
		
		System.out.println(s.length());
		//System.out.println(c);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}	
			
		System.out.println("given string reversed : " + rev);
		
		
		if(s.contains(rev)) {
			System.out.println("given string is polindream : " + rev);

		}else {
			System.out.println("given string is not polindream : " + rev);
		}
	}

}
