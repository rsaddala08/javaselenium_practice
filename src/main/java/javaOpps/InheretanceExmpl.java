package javaOpps;

/*************Simple Inheritance***********/
 class InheretanceExp {
	
	int EmpId=1234;
	
	void disEmpId() {
		System.err.println("Print parent empid:: "+EmpId);
	}
	}

class Employee extends InheretanceExp{
	int EmployeeID=1120;
	 void display() {
		System.out.println("Print child empid:: "+EmployeeID);

	}
	
}

 class InheretanceExmpl{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.display();// Child method
		System.out.println(e.EmployeeID);
		
		e.disEmpId();//Parent methd
		System.err.println(e.EmpId);
	}
}

