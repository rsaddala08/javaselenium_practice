
public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {//outer for loop
			
			for(int j=1;j<=5;j++) {//inner for loop
				
				System.out.println("i value ::"+i+",j value::"+j);
			}
			System.out.println("*******************************");
		}
	}

}
