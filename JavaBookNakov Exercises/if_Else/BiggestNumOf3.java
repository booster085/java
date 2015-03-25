package if_Else;

import java.util.Scanner;

public class BiggestNumOf3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		System.out.print("Biggest number is: ");
		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println(num1);
			} else {
				System.out.println(num3);
			}
		} else {
			if (num2 >= num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
	}
}
