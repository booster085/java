package Homeworks.syntax;

import java.util.Scanner;

public class CountOfBitsOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int decNumber = input.nextInt();
		int bit1Counter = Integer.bitCount(decNumber);
		String binNumber = Integer.toBinaryString(decNumber);
		//here add zeroes if binary number's length is less than 16bits
		if (binNumber.length() < 16) {
			System.out.printf("%016d\n", Long.parseLong(binNumber));
		} else {
			System.out.println(binNumber);
		}
		
		System.out.println(bit1Counter);
	}

}
