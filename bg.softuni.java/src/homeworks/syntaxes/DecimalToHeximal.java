package homeworks.syntax;

import java.util.Scanner;

public class DecimalToHeximal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive decimal number:");
		int decNum = input.nextInt();
		String hexNum = Integer.toHexString(decNum);
		
		System.out.println("In hexadecimal: " + hexNum.toUpperCase());

	}

}
