package introJava;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// Напишете програма, която проверява дали дадено число n (n < 100) е просто
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 0<100");
		
		int number = input.nextInt();
		double limit = Math.sqrt(number);
		String isPrime = "is Prime";
		for (int i = 2; i <= limit; i++) {
			if(number % i == 0){
				isPrime = "Not Prime";
				break;
			}
		}
		System.out.println(isPrime);
	}

}
