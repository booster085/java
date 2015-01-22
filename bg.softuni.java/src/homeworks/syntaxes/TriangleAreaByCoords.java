package homeworks.syntaxes;

import java.util.Scanner;

public class TriangleAreaByCoords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//coordinates
		System.out.println("Enter X, Y for a:");
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		System.out.println("Enter X, Y for b:");
		double bX = input.nextDouble();
		double bY = input.nextDouble();
		System.out.println("Enter X, Y for c:");
		double cX = input.nextDouble();
		double cY = input.nextDouble();
		
		double triangleArea = Math.abs((aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY))/2);

		System.out.println("Triangle area = " + Math.round(triangleArea));

	}

}
