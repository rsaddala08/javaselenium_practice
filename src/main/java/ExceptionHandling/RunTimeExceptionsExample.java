package ExceptionHandling;

public class RunTimeExceptionsExample {
	
	//Arithmatic Exception
	static void display() {
	int a=5;
	int b=0;
	int c=a/b;
	System.out.println(c);
	
	
	String myName="YYYYYYYYYYYYYYYYYY";
	
	//NumberFormatException
	
	String numberData="Capgemini";
		int num=Integer.parseInt(numberData);
		
		System.out.println(num);
		
	
	
	
	//NullPointerException
	
	String val=null;
		
		System.out.println(val.length());
	}
	
	//ArrayIndexOutOfBoundException
	

	public static void main(String[] args) {
		display();
		
		/*try {
	
		display();// Exception should be raised		
		}
		catch (Exception a) {
			//Handle exception
			System.out.println(a);
			
		}*/
		
	}
}
