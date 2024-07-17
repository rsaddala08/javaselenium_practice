package javaOpps;


interface Organization{
	int compCode=12;
	 void TCS();//only declaration
}

interface Org{
	void Capgemini();
}


class Location implements Organization,Org{
	
	public void TCS() {

		System.out.println("TCS Organization related info***");
	}
	
	public void Capgemini() {
		System.out.println("Capgemini Organization related info***");
	}
	
	public void infosys() {
		System.out.println("Infosys Organization related info***");
	}
	
public void ibm() {
	System.out.println("IBM Organization related info***");
	}
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		
		Location
		orss=new Location();
		
		orss.TCS();
		System.out.println(orss.compCode);
		}

}
