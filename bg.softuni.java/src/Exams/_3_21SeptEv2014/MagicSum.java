package Exams._3_21SeptEv2014;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int divider = input.nextInt();
		input.nextLine();
		String line = input.nextLine();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while (!line.equals("End")) {
			int num = Integer.parseInt(line.trim());
			numbers.add(num);
			line = input.nextLine();
		}
		int maxSum = Integer.MIN_VALUE;
		int a = 0;
		int b = 0;
		int c = 0;
		boolean isFoundMagicSum = false;
		for (int i = 0; i < numbers.size() - 2; i++) {
			for (int j = i + 1; j < numbers.size() - 1; j++) {
				for (int j2 = j + 1; j2 < numbers.size(); j2++) {
					int tempSum = numbers.get(i) + numbers.get(j) + numbers.get(j2);
					if (tempSum % divider == 0 && maxSum < tempSum) {
						maxSum = tempSum;
						a = numbers.get(i);
						b = numbers.get(j);
						c = numbers.get(j2);
						isFoundMagicSum = true;
					}
				}
			}
		}
		if (isFoundMagicSum) {
			System.out.printf("(%d + %d + %d) %% %s = 0", a, b, c, divider);
		} else {
			System.out.println("No");
		}
		
		
	}
}
