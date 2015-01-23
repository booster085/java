package homeworks.loops_methods;

import java.util.Scanner;

public class AngleUnitConverter {

	public static double convertDegreesToRadians(double value) {
		double result;
		result = value * (Math.PI / 180);
		return result;
	}

	public static double convertRadiansToDegrees(double value) {
		double result;
		result = value * (180 / Math.PI);
		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();
		double value = 0;
		String measure = "";
		String[] results = new String[n];

		for (int i = 0; i < n; i++) {
			value = input.nextDouble();
			measure = input.next("\\w+");

			if (measure.equalsIgnoreCase("deg")) {
				results[i] = String.format("%.6f rad",
						convertDegreesToRadians(value));
			} else {
				results[i] = String.format("%.6f deg",
						convertRadiansToDegrees(value));
			}
			input.nextLine();
		}
		for (String num : results) {
			System.out.println(num);

		}
	}
}
