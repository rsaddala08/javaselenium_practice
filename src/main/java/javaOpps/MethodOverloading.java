package javaOpps;

public class MethodOverloading {
	
	public void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	
	public void sum(int a, double d,String name) {
		System.err.println(a+d+name);
	}
	
	public static void main(String[] args) {
		MethodOverloading mdl=new MethodOverloading();
		
		mdl.sum(10, 20);
		
		mdl.sum(25, 25.5,"Method");
		
		
	}
	

}
