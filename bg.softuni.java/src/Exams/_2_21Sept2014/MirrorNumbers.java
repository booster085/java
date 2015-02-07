package Exams._2_21Sept2014;

import java.util.Scanner;

public class MirrorNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		input.nextLine();
		String[] numbers = input.nextLine().split("\\s+");
		boolean isFound = false;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				String reversedNumber = new StringBuilder(numbers[i]).reverse().toString();
		
					if (reversedNumber.equals(numbers[j])) {
						System.out.printf("%s<!>%s\n", numbers[i], numbers[j]);
						isFound = true;
					}
			}
		} if (!isFound) {
			System.out.println("No");
		}
		

	}

}
