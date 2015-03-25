package consoleInOut;

import java.util.Scanner;

public class ReadRPrintCircleFaceAndPerim {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle radius: ");
		double radius = input.nextDouble();
		double pi = Math.PI;
		double cirlceS = pi*(radius * radius); 
		double circleP = 2 * pi * radius;
		input.close();
		System.out.printf("Circle S = %.2f%nCircle P = %.2f%n", cirlceS, circleP);

	}

}
