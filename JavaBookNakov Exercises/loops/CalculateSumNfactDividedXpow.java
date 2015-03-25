package loops;

import java.util.Scanner;

public class CalculateSumNfactDividedXpow {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		double n = input.nextDouble();
		System.out.print("Enter X: ");
		double x = input.nextDouble();
		double nFact = 1;
		double xPow = 0;
		double result = 1;
		
		for (int i = 1; i <= n ; i++) {
			nFact = 1;
			for (int j = 1; j <= i; j++) {
				nFact *= j;
			}
			xPow += Math.pow(x, i);
			result += (nFact/xPow);
		}
		System.out.printf("%.2f%n",result);

	}

}
