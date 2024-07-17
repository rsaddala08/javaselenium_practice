package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	  public static void main(String args[]){  

	      List<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      System.out.println(alist.size());
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "RAJU");
	      
	      //displaying elements
	      System.out.println(alist);
	      
	      alist.remove(2);
	      alist.remove("Angela");
	      System.out.println(alist);
	      alist.add(2, "RAJU");
	      System.out.println(alist);
	   }  
}
