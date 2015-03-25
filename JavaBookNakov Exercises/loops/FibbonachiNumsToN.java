package loops;

import java.util.Scanner;

public class FibbonachiNumsToN {
	
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nth Fibbonachi number: ");
		int n = input.nextInt();
		int lastNum = 1;
		int prevNum = 0;
		int temp;
		int sum = 0;
		System.out.print("0, ");
		
		for (int i = 1; i < n; i++) {
			System.out.print(lastNum + ", ");
			sum += lastNum;
			temp = prevNum;
			prevNum = lastNum;
			lastNum = temp + prevNum;
		}	
		System.out.println("\nSum = " + sum);
	}
}
