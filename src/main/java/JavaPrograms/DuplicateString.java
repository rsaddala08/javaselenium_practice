package JavaPrograms;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = {"Anusha","Ram","Max","Mary","Anusha", "Mary"};
		
		boolean flag = false;
		
		for (int i =0 ; i<name.length; i++) {
			 
			for(int j = i+1; j<name.length;j++) {
				if(name[i].equals(name[j])) {
					
					System.out.println("The duplicate string is "+name[i]);
					flag = true;
				}
			}
		}
			if(flag==false) {
				System.out.println("The duplicate value not found");
			}
			
			
}
}
