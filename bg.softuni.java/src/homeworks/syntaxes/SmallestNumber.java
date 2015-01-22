package homeworks.syntaxes;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		System.out.println("Smallest number is: " + min);
		
		
		
	}

}
