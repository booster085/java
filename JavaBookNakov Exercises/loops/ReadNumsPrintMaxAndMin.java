package loops;

import java.util.Scanner;

public class ReadNumsPrintMaxAndMin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Now many numbers? ");
		int numCount = input.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Enter " + numCount + " numbers:");
		
		for (int i = 0; i < numCount; i++) {
			int number = input.nextInt();
			if (number > max) {
				max = number;
			} 
			if (number < min) {
				min = number;
			}
		}
		System.out.printf("min number is: %d%nmax number is: %d%n", min, max);
	}
}
