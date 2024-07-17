package JavaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "helloWorld";
		int len = str.length();
		String s1 = "world ";
		String s2 = "welcome";
		
		System.out.println(len);
		System.out.println(str.concat(s1));
		System.out.println(str.concat(s1).concat(s2));
		System.out.println(str.trim());
		System.out.println(str.charAt(4));
		System.out.println(str.contains("hel"));
		System.out.println(str.equalsIgnoreCase("HELLO"));
		System.out.println(str.replace("hello","java" ));
		System.out.println(str.substring(3, 6));
		System.out.println(str.toUpperCase());
		

	}

}
