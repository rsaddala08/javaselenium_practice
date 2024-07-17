package JavaPrograms;

import java.util.Arrays;

public class SecondHighestNumber {
	public static void main(String[] args) {
	        //int[] numbers = {5, 10, 2, 8, 7, 15,20,27};
		int[] numbers= {10,282,17391,1038};
	        int secondHighest = findSecondHighest(numbers);

	        System.out.println("Second highest number: " + secondHighest);
	    }

	    private static int findSecondHighest(int[] arr) {
	        // Check if the array has at least two elements
	        if (arr.length < 2) {
	            System.out.println("Array should have at least two elements");
	            return -1; // You may handle this differently based on your requirements
	        }

	        // Sort the array in descending order
	        Arrays.sort(arr);

	        // The second highest element is at index length - 2
	        return arr[arr.length - 2];
	    }
	}

