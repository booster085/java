package Exams._2_21Sept2014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PossibleTriangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isRealTriangle = false;
		String line = input.nextLine();
		while (!line.equals("End")) {
			double a, b, c;
			String[] numbersAsStr = line.trim().split("\\s+");
			ArrayList<Double> numbers = new ArrayList<Double>(3);
			numbers.add(Double.parseDouble(numbersAsStr[0]));
			numbers.add(Double.parseDouble(numbersAsStr[1]));
			numbers.add(Double.parseDouble(numbersAsStr[2]));
			Collections.sort(numbers);
			if (numbers.get(0) + numbers.get(1) > numbers.get(2)) {
				System.out.printf("\n%.2f+%.2f>%.2f", numbers.get(0), numbers.get(1), numbers.get(2));
				isRealTriangle = true;
			}	
			line = input.nextLine();
		}
		if (!isRealTriangle) {
			System.out.println("No");
		}

	}

}
