package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,9,19754,16,187,2,10,10,23,25);
		
		List<Integer> duplicate=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<>();
		for(Integer i:list) {
			if(set.contains(i)) {
				duplicate.add(i);
			}else {
				set.add(i);
			}
			
		}
		System.out.println(duplicate);
		

	}

}
