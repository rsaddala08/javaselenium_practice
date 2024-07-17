package javaOpps;

 abstract class Person{
	 
	abstract void getPersonDetails();   //only declaration
	 
 }

class Customer extends Person{
	
void getPersonDetails() {//method implementaiopn here
	
		System.out.println("Get Person Data");
	}
	}

class AbstractExample {
	public static void main(String[] args) {
		
		Customer cust=new Customer();
		cust.getPersonDetails();
		
	}
	
}
