package methods;

import java.util.Scanner;

public class CountNumberInArray {
	
	public static int countNumberInArray(int number, int[] arr){
		int counter = 0;
		for (int i : arr) {
			if (number == arr[i]) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = {1,2,3,5,4,4,2,3,5,4,3,4};
		try {
			System.out.println("Enter number to look for:");
			int num = input.nextInt();
			int result = countNumberInArray(num, arr);
			System.out.printf("Number repeats %d times", result);
		} catch (Exception e) {
			System.out.println("Entered numbers are not integers!");
		}
			
	}

}
