package JavaKeywords;

public class StaticKeyword {
	
 static int EmpID=12345;//Static variable
	
 static void getEmployeeID() {//Static Method
		
		System.out.println("I am Static Method");
	}
	
	static {
		System.err.println("I am a Static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Static variable Data ::"+EmpID);
		getEmployeeID();
		
	}
}
