package homeworks.syntaxes;

import java.util.Scanner;

public class CountOfBitsOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int decNumber = input.nextInt();
		String binNumber = Integer.toBinaryString(decNumber);
		int bit1Counter = 0;
		for (int i = 0; i < binNumber.length(); i++) {
			if (binNumber.charAt(i) == '1') {
				bit1Counter++;
			}
		}
		//here add zeroes if binary number's length is less than 16bits
		if (binNumber.length() < 16) {
			String sixteenZeroes = "0000000000000000";
			binNumber = (sixteenZeroes + binNumber)
					.substring(binNumber.length());
		}
		System.out.println(binNumber);
		System.out.println(bit1Counter);

	}

}
