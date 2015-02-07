package Exams._4_3Sept2014;

import java.util.Scanner;

public class AddingAngels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOfAngles = input.nextInt();
		input.nextLine();
		int[] angles = new int[numberOfAngles];
		for (int i = 0; i < angles.length; i++) {
			angles[i] = input.nextInt();
		}
		boolean isACircle = false;
		for (int i = 0; i < angles.length - 2; i++) {
			for (int j = i + 1; j < angles.length - 1; j++) {
				for (int k = j + 1; k < angles.length; k++) {
					int anglesSum = angles[i] + angles[j] + angles[k];
					if (anglesSum % 360 == 0) {
						System.out.printf("%d + %d + %d = %d degrees\n", angles[i], angles[j], angles[k], anglesSum);
						isACircle = true;
					}
				}
			}
		}
		if (!isACircle) {
			System.out.println("No");
		}

	}

}
