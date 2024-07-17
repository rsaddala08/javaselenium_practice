package JavaPrograms;

import java.util.Random;

public class BestChoice {

	public static void main(String[] args) {

		String myChoice = "Andi,Bava, Mama, Honey, Name, Darling, Love, Baby, Raju";

		String val="TC01_Test_Automation_GW_PC";
		
		String value[]=val.split("_");
		System.out.println(val.substring(0, 5));
		
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		System.err.println(c);
	}

}
