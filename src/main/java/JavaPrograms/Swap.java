package JavaPrograms;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Anusha";
		String S2 = "Chetan";
		
		S1 = S1.concat(S2);   //anushachetan
		S2 = S1.substring(0, 6); // anusha
		S1 = S1.substring(6,12); // chetan
		
		System.out.println(S1);
		System.out.println(S2);
		
		
		String a = "Krishna";
		String b = "Reddy";
		a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
	}

}
