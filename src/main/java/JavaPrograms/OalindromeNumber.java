package JavaPrograms;

public class OalindromeNumber {

	public static void main(String[] args) {
		
		int r,sum=0,temp=0;
		int n=424;
		
		while(n>0) {
			
			r=n%10;
			sum=(sum*10)/r;
			n=n/10;
		}
		if(temp==sum) 
			System.out.println("Palindrome = Yes");
			
	        else
	            System.out.println("Palindrome = No");
	}

}
