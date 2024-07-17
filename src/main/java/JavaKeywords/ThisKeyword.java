package JavaKeywords;

 class ThisKeywordExmpl {
	
	//Instance variables
	int empID=10111;
	String empName="ABC";
	
	
	
	  //Constructors
	  
	  ThisKeywordExmpl(int id,String name) {
	
		  this.empID=id;
		  
		  this.empName=name;
		  
		  
	  }
	 
	
 void getEmpDetails()
 {
	 //System.out.println(empID+"  "+empName);
	 
	 System.out.println("EMp details");
 }
 void getData() {
	 
	 this.getEmpDetails();
	 System.out.println("Employee ID is::"+this.empID);
	 
	 System.out.println("Employee Name is::"+this.empName);
	 
 }
 
}

 class ThisKeyword{
	public static void main(String[] args) {
		
		ThisKeywordExmpl thisEx=new ThisKeywordExmpl(12,"xtyyyyy");
		
		//ThisKeywordExmpl thisEx=new ThisKeywordExmpl();
		System.err.println(thisEx.empID);
		System.err.println(thisEx.empName);
		
		thisEx.getData();
		
		
	}
}

