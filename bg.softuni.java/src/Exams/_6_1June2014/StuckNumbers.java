package Exams._6_1June2014;

import java.util.Scanner;

public class StuckNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextLine();
		String[] numbers = input.nextLine().split("\\D+");
//  Converting strings to int makes program much faster
		boolean isStuckNumbers = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (!numbers[i].equals(numbers[j])) {
					for (int m = 0; m < numbers.length; m++) {
						if(!numbers[i].equals(numbers[m]) &&
								!numbers[j].equals(numbers[m])) {
						for (int k = 0; k < numbers.length; k++) {
							if ((numbers[i] + numbers[j]).equals(numbers[m]
									+ numbers[k])) {
								if (!numbers[i].equals(numbers[k])
									&& !numbers[j].equals(numbers[k])
									&& !numbers[m].equals(numbers[k])) {
									System.out.printf("%s|%s==%s|%s\n",
											numbers[i], numbers[j], numbers[m],
											numbers[k]);
									isStuckNumbers = true;
								}
							}
						}
						}
					}
				}

			}
		}
		if (!isStuckNumbers) {
			System.out.println("No");
		}

	}
}
