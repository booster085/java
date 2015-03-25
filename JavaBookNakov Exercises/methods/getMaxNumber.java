package methods;

import java.util.Scanner;

public class getMaxNumber {
	
	public static int getMaxNumber(int a, int b){
		int maxNumber = a;
		if (a < b) {
			maxNumber = b;
		}
		
		return maxNumber;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers on different row.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int biggerNum = getMaxNumber(a, b);
		int maxNum = getMaxNumber(biggerNum, c);
		System.out.println("Max number is " + maxNum);
	}

}
