package Exams._8_26May2014;

import java.util.Scanner;

public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		boolean isPythagoreanNumber = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] <= numbers[j]) {
					for (int k = 0; k < numbers.length; k++) {
						if (numbers[i] * numbers[i] + numbers[j] * numbers[j] == numbers[k]
								* numbers[k]) {
							System.out.printf(
									"%1$d*%1$d + %2$d*%2$d = %3$d*%3$d\n",
									numbers[i], numbers[j], numbers[k]);
							isPythagoreanNumber = true;
						}
					}
				}
			}
		}
		if (!isPythagoreanNumber) {
			System.out.println("No");
		}
	}

}
