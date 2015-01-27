package Homeworks.syntax;

import java.util.Scanner;

public class CountEqualBitPairs {

	public static void main(String[] args) {
		
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
