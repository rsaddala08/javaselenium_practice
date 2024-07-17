package javaOpps;

/*************Multilevel Inheritance***********/
 class GrandParent {
	
	int stuId=1234;
	
	void disEmpId() {
		System.err.println("Print Grand parent id:: "+stuId);
	}
	}

class Parent extends GrandParent{
	int stuRoll=11;
	 void display() {
		System.err.println("Print Parent id:: "+stuRoll);

	}
	
}
class Child extends Parent{
	int childId=1120;
	 void show() {
		System.out.println("Print child id:: "+childId);

	}
	
}

 class MultilevelInheritance{
	public static void main(String[] args) {
		Child chld=new Child();
		chld.show();
		//System.err.println("Print child id:: "+chld.childId);
		
		chld.display();//accesing parent data
		
		chld.disEmpId();//accessing grand parent data
		
		
		
		
	}
}

