package javaOpps;

public class ConstructorExmp {

	
	 int empId;
	 String empName;
	 
//This default constructor 
	 ConstructorExmp()
	 {
		 empId=10;
		 empName="Capgemini";
	 }
	 
	 //Parameteraised constructor
	 ConstructorExmp(int neEmpID,String newEmpName){
		 
		 empId=neEmpID;
		 empName=newEmpName;
		 
	 }
	 
	
	public static void main(String[] args) {
	
		//default constructor object creation
		ConstructorExmp  con=new ConstructorExmp();
		
		System.out.println("Default Constructor Employee Id is::"+con.empId);
		System.out.println("Default Constructor Employee Name is::"+con.empName);
		
		//Parametarized constructor object creation
	    ConstructorExmp  param=new ConstructorExmp(1120,"HCL");
		
		System.err.println("Parametarized Constructor Employee Id********::"+param.empId);
		System.err.println("Parametarized Constructor Employee Name******::"+param.empName);
		
	}

}
