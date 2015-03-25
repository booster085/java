package introJava;

import java.util.Scanner;

public class FindNthBitInNumber {

	public static void main(String[] args) {
		/* Дадено е число n и позиция p. Напишете поредица от операции, 
		които да отпечатат стойността на бита на позиция p от числото n (0 или 1). 
		Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");	
		int num = input.nextInt();
		
		System.out.println("Enter bit position: ");
		int bitPosition = input.nextInt();
		int i = 1;
		int mask = i << bitPosition;
		
		System.out.println("The " + bitPosition + 
				" bit is: " + (((num & mask) == 0) ? 0 : 1));
	}

}
