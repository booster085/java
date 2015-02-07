package Exams._6_1June2014;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SimpleExpresion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String expression = input.nextLine().replaceAll("\\s+", "");
		String[] numbers = expression.split("[^0-9\\.]+");
		String[] signs = expression.split("[^+-]+");
		BigDecimal result = new BigDecimal(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			BigDecimal nextNum = new BigDecimal(numbers[i]);
			String sign = signs[i];
			switch (sign) {
			case "-": result = result.subtract(nextNum);
				break;
			case "+": result = result.add(nextNum);
				break;
			default:
				break;
			}
		}
		System.out.printf("%.7f", result);
		
	}
}
