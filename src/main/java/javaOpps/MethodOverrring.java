package javaOpps;

class ParentClass {
		
		int EmpId=1234;
		
		void display(int x,int y) {
			System.err.println("Print parent empid:: "+EmpId);
		}
		}

	class ChildCalss extends ParentClass{
		int EmployeeID=1120;
		 void display(int x, int y) {
			System.out.println("Print child empid:: "+EmployeeID);

		}
		
	}

	 class MethodOverrring{
		public static void main(String[] args) {
			ChildCalss ch=new ChildCalss();
			
			ch.display(10, 20);
			
			ParentClass pc=new ChildCalss();
			pc.display(1, 2);
		}
	}


