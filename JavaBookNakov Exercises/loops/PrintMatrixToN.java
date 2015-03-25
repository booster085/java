package loops;

import java.util.Scanner;

public class PrintMatrixToN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		for (int row = 1; row <= n; row++) {
			for (int col = row; col < row + n; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
