package arrays;

import java.util.Scanner;

public class MaxSumOfKArrayElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array length: ");
		int nNum = input.nextInt();

		System.out.println("Enter array values:");
		int[] arr = new int[nNum];

		for (int i = 0; i < nNum; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Enter number of elements to calc: ");
		int kNum = input.nextInt();

		// Sort Array
		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] > arr[k]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		input.close();
		int sum = 0;
		for (int i = arr.length - kNum; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("Max sum of K elements is: " + sum);
	}

}
