package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		 int number = 19; // You can replace this with any number you want to check

		        boolean isPrime = isPrimeNumber(number);

		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }

		    private static boolean isPrimeNumber(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
}
