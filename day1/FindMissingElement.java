package week2.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 3, 2, 8, 6, 7};
		
		// Step 1: Find the maximum number in the array
		int max = arr[0];
		for(int num : arr) {
			//System.out.println(arr);
			System.out.println("num: " + num);
			if(num > max) {
				max = num;
				
			}
			
		}
		
		Arrays.sort(arr);
		
		//Loop and find the missing element
		for(int i =0; i < arr.length; i++) {
			
			if(arr[i] != i+1) {
				System.out.println("Missing number: " + (i+1));
				break;
				
			}
		}
	}

}
