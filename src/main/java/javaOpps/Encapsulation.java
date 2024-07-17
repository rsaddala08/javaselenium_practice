package javaOpps;

public class Encapsulation {

	
	private int empId;
	private String empName;

	//getter/setter methods

	public int getEmpId(){
		return empId;

	//return empId;
	}
	public String getEmpName(){

	return empName;
	}

	public void setEmpId(int newID){

	empId=newID;
	}
	public void setEmpName(String newName){

	empName=newName;
	}
	public static void main(String[] args) {
	
		Encapsulation  encap=new Encapsulation();
		
		encap.setEmpId(101120);
		encap.setEmpName("JAVA");
		
		System.out.println("Employee Id is::"+encap.getEmpId());
		System.out.println("Employee Name is::"+encap.getEmpName());
	}

}
