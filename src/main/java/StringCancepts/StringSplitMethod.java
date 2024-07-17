package StringCancepts;

public class StringSplitMethod {

	public static void main(String[] args) {
		
		
		String name="Sravani,Veena,Mahi,Deepthi,Radhika,Venu,Anisha";
		
		System.err.println(name);

		String val[]=name.split(",");
		
	for(int i=0;i<=val.length;i++){
		
		System.out.println(val[i]);
		
		
	}
		
		/*System.err.println(val[0]);
		
		System.out.println(val[1]);
		System.err.println(val[2]);
		System.out.println(val[3]);
		System.err.println(val[4]);
		System.out.println(val[5]);
		System.err.println(val[6]);*/
	}

}
