package Homeworks.syntax;

import java.util.Scanner;

public class CountEqualBitPairs {

	public static void main(String[] args) {
		
		/*
		 * Write a program to count how many sequences of two equal bits 
		 * ("00" or "11") can be found in the binary representation of 
		 * given integer number n (with overlapping). Examples:
		 */
		Scanner input = new Scanner(System.in);

		int decNumber = input.nextInt();
		String binNumber = Integer.toBinaryString(decNumber);
		int equalBitCounter = 0;
		for (int i = 0; i < binNumber.length() - 1; i++) {
			if (binNumber.charAt(i) == binNumber.charAt(i+1)) {
				equalBitCounter++;
			}
		}
		System.out.println("Binary number " + binNumber);
		System.out.println("Equal pairs: " + equalBitCounter);

	}

}
