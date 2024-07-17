package JavaPrograms;

import java.util.Arrays;

public class SecondHeighest {
	public static int getMaxNumber(int[] arr) {
	
		if(arr.length<2) {
			return -1;
		}
		
		Arrays.sort(arr);
		
		return arr[arr.length - 2];
	}
		
	public static void main(String[]a) {
	
		int[] arr= {10,282,17391,1038,17291,10180,150000};
		int scndNum=getMaxNumber(arr);
		System.out.println(scndNum);
	}
}
