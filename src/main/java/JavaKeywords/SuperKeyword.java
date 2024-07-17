package JavaKeywords;

class Language{//Parent class
	
	int a=10;
	public void lan() {
		System.out.println("I am Launguage Calss Method!!");
	}
	
}

 class Telugu extends Language{
	 
	 public void language() {
		 	super.lan();// Method level acces for parent class
			System.out.println(super.a);//Variable access form parent class
			System.out.println("I am Telugu Calss Methd");
		}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Telugu tl=new Telugu();
		tl.language();
		
	}

}
