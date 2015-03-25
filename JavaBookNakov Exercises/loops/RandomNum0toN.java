package loops;

import java.util.Scanner;
import java.util.Random;

public class RandomNum0toN {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		System.out.printf("Random number between 1 and %d : ", n);
				
		for (int i = 0; i < 5; i++) {
			int number = 1 + rand.nextInt(n);
			//rand.nextInt((max - min) + 1) + min;  for specific range
			System.out.print(number + ", ");
		}
		
		
	}

}
