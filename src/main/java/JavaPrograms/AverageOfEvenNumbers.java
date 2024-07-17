package JavaPrograms;

public class AverageOfEvenNumbers {

	public static void main(String[] args) {

		int number = 100,count = 0;
		   double evenSum = 0,average ;
		   for (int i = 0; i <= number; i++) {
			  if(i%2 == 0) {
		    	  evenSum = evenSum + i;
		         count++;
		      }
		   }
		   average = evenSum/count;
		   System.out.println("The average of even numbers from 0-50 is : " +average);
	}
}
