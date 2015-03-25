package introJava;

import java.util.Scanner;

public class CheckIfPointIsInCircle {

	public static void main(String[] args) {
		//c2 = a2 + b2
		//Out of rectangle (-1, 1), (5, 5)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X coordinate: ");
		double oX = input.nextDouble();
		System.out.println("Enter Y coordinate: ");
		double oY = input.nextDouble();
		double kRadius = 5;
		double recX = -1;
		double recY = 1;
		double resultCircle = Math.sqrt((oX * oX) + (oY * oY));
		
		if ((resultCircle <= kRadius) && (oX <= recX || oY <= recY)){
			System.out.println("The point is in the circle and Out of rectangle");
		} else {
			System.out.println("Not in the circle or/and in the rectangle");
		}
	}

}
