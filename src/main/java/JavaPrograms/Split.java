package JavaPrograms;

public class Split {

	public static void main(String[] args) {

		String Str = "Anusha Reddy Mallela";
		String name[] = Str.split(" ");
		System.out.println("This string contains " + name.length + " words");
		for(String x:name) {
			System.out.println(x);
		}
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}
}
