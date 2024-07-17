package ExceptionHandling;

public class RunTimeExceptions {
	
	//Arithmatic Exception
	static void display() {
	int a=5;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}
	//NumberFormatException
	
	static void numberFormate() {
		String numberData="Capgemini";
		int num=Integer.parseInt(numberData);
		
		System.out.println(num);
		
	}
		
	//NullPointerException
	
	static void nullPointerExcp() {
		String val=null;
		
		System.out.println(val.length());
		
	}
	
	//ArrayIndexOutOfBoundException
	

	static void arrayIndex() {
		int val[]=new int[5];
		
		val[6]=10;
		
	}
	
	public static void main(String[] args) {
		
		try {
	
		display();// Exception should be raised		
		
		}catch(ArithmeticException a) {
			System.err.println(a);	
		}
		

		try {
			
			numberFormate();// Exception should be raised	
			
			System.out.println("String converted successfully");
			}
			catch (NumberFormatException n) {
				//Handle exception
				System.err.println(n);
				
			}
		
			try {
			
				nullPointerExcp();// Exception should be raised	
			
			}
			catch (NullPointerException n) {
				//Handle exception
				System.err.println(n);
				
			}
			try {
				
				arrayIndex();// Exception should be raised	
			
			}
			catch (ArrayIndexOutOfBoundsException a) {
				//Handle exception
				System.out.println(a);
				
			}
			
			finally {
				System.out.println("Always Executed");
			}
		}

}
