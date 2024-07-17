package JavaPrograms;

public class ReverseOfWords {
	public static void main(String args[]) {
	        
	        String str="Hellow Java Reverse Words Program";
	        
	        StringBuilder sb=new StringBuilder();
	        
	        String []wordsString=str.split(" ");
	        
	        for(int i=wordsString.length-1;i>=0;i--){
	            
	            sb.append(wordsString[i]).append(" ");
	            
	        }
	        
	       System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + sb);
	        
	    
	    }
	    
	    }



