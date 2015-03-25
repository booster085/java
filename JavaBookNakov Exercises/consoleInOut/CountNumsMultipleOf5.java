package consoleInOut;

import java.util.Scanner;

public class CountNumsMultipleOf5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int result = (num2 - num1) / 5;
		input.close();
		System.out.printf("There are %d numbers multiply of 5", result);
	}

}
