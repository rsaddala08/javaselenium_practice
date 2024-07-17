package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class MaxNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,9,19754,16,187);
		//Max value
		Integer max=Integer.MIN_VALUE;
		
		//Min Value
		//Integer max=Integer.MAX_VALUE;
		
		for(Integer min:list) {
			
			//for MIN value change to "<"
			if(min>max) {
				max=min;
				
			}
		}
		System.out.println(max);
		
		//approch 2: Java Stream and max to find the max element in array
		int [] value = {2,9,19754,16,187};
        int maximunNum = Arrays.stream(value).max().getAsInt();
        System.out.println(maximunNum);
        
        //Approch 3: 
        
        int maxi = value[0];
        
        for(int i=0;i<value.length;i++) {
        	
        	if(value[i]>maxi) {
        		maxi=value[i];
        	}
        }
        
        System.out.println("Largest in given array is " + maxi);
        
	}

}
