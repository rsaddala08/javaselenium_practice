package ExceptionHandling;

public class ThrowClass {
	
	 //function to check if person is eligible to vote or not   
    public static void validate(int age)  throws NullPointerException,ArithmeticException{  
       
    	if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
           // throw new ArithmeticException("Person is not eligible to vote");
    		System.out.println("Person is not eligible to vote");
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
    	 validate(16);  
    	
        System.out.println("rest of the code...");    
  }    
}  

