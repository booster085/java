package loops;

import java.util.Scanner;

public class NfactMultiplyKfactDividedNminusK {

	public static void main(String[] args) {
		//N!*K!/(N-K)! за дадени N и K
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers N>K\nN = ");
		int n = input.nextInt();
		System.out.print("K = ");
		int k = input.nextInt();
		long result;
		long factN = 1;
		long factK = 1;
		
		for (int i = (n - k) + 1; i <= n; i++) {
			factN *= i;
			}
		for (int j = 1; j <= k; j++) {
			factK *= j;
		}
		result = factK * factN;
		System.out.println("N!*K!/(N-K)! = " + result);
			
	}

}
