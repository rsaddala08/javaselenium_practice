package JavaPrograms;

public class StringConversions {

	public static void main(String[] args) {

		//String----Integer
		String s = "1234";
		System.out.println(s.getClass().getName());
		Integer num = Integer.parseInt(s);
		System.out.println(num.getClass().getName());
		System.out.println(num);
		
		//string ----double
		String s1 = "10.65";
		System.out.println(s1.getClass().getName());
		Double d = Double.valueOf(s1);
		System.out.println(d.getClass().getName());
		System.out.println(s);
		
		// double to string
		Double d1 = 12.45;
		System.out.println(d1.getClass().getName());
		String s3 = String.valueOf(d1);
		System.out.println(s3.getClass().getName());
	}
}
