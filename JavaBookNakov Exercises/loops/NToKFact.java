package loops;

import java.util.Scanner;

public class NToKFact {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers 1<K<N\nK = ");
		int startNum = input.nextInt();
		System.out.print("N = ");
		int endNum = input.nextInt();
		int fact = 1;
		for (int i = startNum + 1; i <= endNum; i++) {
			fact *= i;
		}
		System.out.print("N!/K! = " + fact);
	}

}
