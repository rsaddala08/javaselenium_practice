package JavaPrograms;

public class SwapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Anusha";
		//int x = S1.length();
		String S2 = "Reddy";
		//int y = S2.length();
		
		S1 = S1.concat(S2);         //AnushaReddy
		S2 = S1.substring(0, S1.length()-S2.length()); //Anusha
		S1 = S1.substring(S2.length());
		System.out.println(S1);
		System.out.println(S2);
		
		

	}

}
