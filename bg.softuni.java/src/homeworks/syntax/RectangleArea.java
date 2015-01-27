package Homeworks.syntax;

import java.util.Scanner;

public class RectangleArea {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Rectangle sides A and B: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double area = a * b;
		System.out.println("Rectangle area = " + (area > 0 ? area : 0));
	}

}
