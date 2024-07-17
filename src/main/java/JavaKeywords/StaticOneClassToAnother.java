package JavaKeywords;



class OneToAnother{
	
	static int EmpId =10;
	
	void getValue() {
		System.out.println("***************Print Int value********************");
	}
	
	static void display() {
		System.out.println("*********************************************************************");
	}
	
	
	static {
		System.out.println("******STatic Bock********");
	}
	
}

public class StaticOneClassToAnother {

	public static void main(String[] args) {
		System.out.println(OneToAnother.EmpId);
		
		OneToAnother.display();
		
		OneToAnother one=new OneToAnother();
		one.getValue();
	}
	
}
