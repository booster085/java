package homeworks.syntaxes;

import java.util.Scanner;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//coordinates
		System.out.println("Enter point coords:");
		float aX = input.nextFloat();
		float aY = input.nextFloat();
		
		//whole rectangle borders
		float bigRectXmin = 12.5f;
		float bigRectXmax = 22.5f;
		float bigRectYmin = 6f;
		float bigRectYmax = 13.5f;
		
		//empty rectangle borders;
		float smallRectXmin = 17.5f;
		float smallRectXmax = 20f;
		float smallRectYmin = 8.5f;
		String result = "Outside";
		
		//check if point is in the big rectangle and out of small rectangle
		if (aX >= bigRectXmin && aX <= bigRectXmax &&
				aY >= bigRectYmin && aY <= bigRectYmax) {
			if (!(aX > smallRectXmin && aX < smallRectXmax && aY > smallRectYmin)) {				
				result = "Inside";
			}
		}
		System.out.println(result);
	}

}
