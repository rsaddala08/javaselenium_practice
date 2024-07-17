package JavaPrograms;

public class Duplicatesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "This is a java programe It is java useful";
		
		String name [] = Str.split(" ");
		boolean flag = false;
		
		for (int i =0 ;i<name.length;i++) {
			
			for(int j = i+1;j<name.length;j++ ) {
				
				if(name[i].equals(name[j])) {
					
					System.out.println("The duplicate string is :"+name[i]);
					flag = true;
				}
			}
			
			
		}
		if (flag==false) {
			
			System.out.println("The duplicate string not found");
		}
			
			

	}

}
