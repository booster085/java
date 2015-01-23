package homeworks.loops_methods;

import java.util.Scanner;

public class SymmetricNumbersInRange {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//0<=Start<=End<=999
		System.out.println("Enter two numbers 0<=Start<=End<=999:");
		int start = input.nextInt();
		int end = input.nextInt();
		for (int i = start; i <= end; i++) {
			String numberAsStr = String.valueOf(i);
			if (numberAsStr.charAt(0) == numberAsStr.charAt(numberAsStr.length() - 1)) {
				System.out.println(i);
			}
		}
	}
}
