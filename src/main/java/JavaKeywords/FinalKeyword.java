package JavaKeywords;


//Class level - declare before class is final insted of public
 class FinalKeyword {
	


/*class FinalClass extends FinalKeyword1{
	
	void m1()
	{
		System.out.println("Child Method");
	}
	
}
	
	*/
	//Variable
	
	final int data=10;
	
	//Method
	final void display() {
		System.out.println("I Am final Method");
	}
	
	public static void main(String[] args) {
		FinalKeyword finalK=new FinalKeyword();
		
		System.out.println(finalK.data);
		finalK.display();
	}
	
 }
 
 
 /*
class FinalKeyword {
	public static void main(String[] args) {
		FinalKeyword finalK=new FinalKeyword();
		//fianlK.display();
		//System.out.println(finalK.data());
		
		
	}
*/	
//}
