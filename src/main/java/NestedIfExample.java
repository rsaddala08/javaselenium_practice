
public class NestedIfExample {

public static void main (String[]abc){

		String name="xyz";

		int age=20;

		if(name.equals("xyz")){
		System.out.println("Name should be matched");

			if(age==10){
			System.out.println("Age should be matched");
			}else{
				System.out.println("Age not matched");
		}}
		else{
		System.out.println("Name not matched");
		}
		}
}
