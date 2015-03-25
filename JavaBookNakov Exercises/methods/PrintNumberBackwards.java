package methods;

import java.util.Scanner;

public class PrintNumberBackwards {
	
	public static String reverseNumber(int num){
		String reversed = "";
		while(num > 0){
			reversed += (num % 10);
			num = num / 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to reverse: ");
		int num = input.nextInt();

		System.out.printf("%d -> %s", num, reverseNumber(num));
		
	}

}
