package javaOpps;

/*************Hierarchile Inheritance***********/
 class ParentChild {
	
	int stuId=1234;
	
	void disEmpId() {
		System.err.println("Print ParentChild id:: "+stuId);
	}
	}

class Child1 extends ParentChild{
	int stuRoll=11;
	 void display() {
		System.err.println("Print Child1 id:: "+stuRoll);

	}
	
}
class Child2 extends ParentChild{
	int childId=1120;
	 void show() {
		System.out.println("Print child2 id:: "+childId);

	}
	
}

 class HierarchileInheritance{
	public static void main(String[] args) {
		Child1 chld1=new Child1();
		
		//chld1.display();//accesing parent data
		
		//chld1.disEmpId();//accessing child1 data
		
		
		Child2 chld2=new Child2();
		chld2.show();
		chld2.disEmpId();
		
	}
}

