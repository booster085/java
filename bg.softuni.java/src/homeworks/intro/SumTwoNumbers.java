package Homeworks.intro;

import java.util.Scanner;

/**
 * @author Ilian
 *
 */
public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println( "a + b = " + sum);
		input.close();
	}

}
