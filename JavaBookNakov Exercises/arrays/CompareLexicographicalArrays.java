package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CompareLexicographicalArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first text: ");
		String firstText = input.nextLine();
		System.out.print("Enter second text: ");
		String secondText = input.nextLine(); 
		
		char[] arr1 = firstText.toCharArray();
		char[] arr2 = secondText.toCharArray();
		int result = 0;
		input.close();
		
		if (!Arrays.equals(arr1, arr2)){
			int minLength = Math.min(arr1.length, arr2.length);
			result = arr1.length > arr2.length ? 2 : 1;
			
			for (int i = 0; i < minLength; i++) {
				if(arr1[i] > arr2[i]){
					result = 2;
					break;
				} else if(arr1[i] < arr2[i]){
					result = 1;
					break;
				}
			}
		}
		if(result != 0){
			System.out.printf("%d text is lexicographically shorter", result);
		} else {
			System.out.println("Texts are equal.");
		}
	}
}
