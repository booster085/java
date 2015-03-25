package introJava;

import java.util.Scanner;

public class FindNthBitInNumber {

	public static void main(String[] args) {
		/* ������ � ����� n � ������� p. �������� �������� �� ��������, 
		����� �� ��������� ���������� �� ���� �� ������� p �� ������� n (0 ��� 1). 
		������: n=35, p=5 -> 1. ��� ���� ������: n=35, p=6 -> 0.*/
		
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
