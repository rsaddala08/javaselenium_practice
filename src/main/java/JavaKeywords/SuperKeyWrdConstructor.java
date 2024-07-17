package JavaKeywords;

class LanguageSuper{
	
	LanguageSuper(){
		System.out.println("I am Launguage Super Constructor");
	}
	
	int a=10;
	public void language() {
		System.err.println("I am Launguage super Calss Method");
	}
	
}

 class TeluguSuper extends LanguageSuper{
	 TeluguSuper(){
			System.out.println("I am Telugu Child Constructor");
	 }
	  int a=20;
	   public void language() {
		 	
			System.err.println("I am Telugu child Calss Method");
			System.err.println(super.a);
			System.out.println(this.a);
			
			super.language();
	   }
}


public class SuperKeyWrdConstructor {
	public static void main(String[] args) {
		TeluguSuper teluguSpr=new TeluguSuper();
		teluguSpr.language();
	}
}
