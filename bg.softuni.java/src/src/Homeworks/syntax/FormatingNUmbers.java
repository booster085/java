package Homeworks.syntax;

import java.util.Locale;
import java.util.Scanner;

public class FormatingNUmbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integer |0 <= a <= 500|");
		int a = input.nextInt();
		System.out.println("Enter two floating-point numbers:");
		float b = input.nextFloat();
		float c = input.nextFloat();
		int aBinary = Integer.parseInt(Integer.toBinaryString(a));
		//separated in 4 rows to be more readable
		System.out.printf("|%-10X|", a);
		System.out.printf("%010d|", aBinary);
		System.out.printf("%10.2f|", b);
		System.out.printf("%-10.3f|", c);
		

	}

}
