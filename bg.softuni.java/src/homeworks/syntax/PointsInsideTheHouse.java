package Homeworks.syntax;

import java.util.Scanner;

public class PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Point coordinates
		System.out.println("Enter point coordinates:");
		float pX = input.nextFloat();
		float pY = input.nextFloat();

		// triangle vertices
		float leftTipX = 12.5f;
		float leftTipY = 8.5f;
		float rightTipX = 22.5f;
		float rightTipY = leftTipY;
		float topX = 17.5f;
		float topY = 3.5f;

		// big rectangle borders
		float bigRectXmin = 12.5f;
		float bigRectXmax = 17.5f;
		float bigRectYmin = 8.5f;
		float bigRectYmax = 13.5f;

		// small rectangle borders;
		float smallRectXmin = 20f;
		float smallRectXmax = 22.5f;
		float smallRectYmin = bigRectYmin;
		float smallRectYmax = bigRectYmax;
		String result = "Outside";
		/*
		 * The point must be on the inner side of all triangle lines, or to lie 
		 * on some of them to belong to the triangle
		 */
		float pointPosition1 = calcPointPositionToLine(leftTipX, leftTipY,
				rightTipX, rightTipY, pX, pY);
		float pointPosition2 = calcPointPositionToLine(leftTipX, leftTipY,
				topX, topY, pX, pY);
		float pointPosition3 = calcPointPositionToLine(rightTipX, rightTipY,
				topX, topY, pX, pY);
		
		if (pointPosition1 <= 0 && pointPosition2 >= 0 && pointPosition3 <=0 ) {
			result = "Inside";
		} else if (pX >= bigRectXmin && pX <= bigRectXmax && pY >= bigRectYmin
				&& pY <= bigRectYmax) {
			result = "Inside";

		} else if (pX >= smallRectXmin && pX <= smallRectXmax
				&& pY >= smallRectYmin && pY <= smallRectYmax) {
			result = "Inside";
		} 
		System.out.println(result);

	}

	/**
	 * 
	 * @param aX, aY, bX, bY - coordinates of the ending points of the line AB
	 * @param cX, cY - coordinates of the point we are checking for
	 * @return - if value is positive the point is on the right side of the line 
	 * if value is negative the point is on the left side of the line 
	 * and if the result is 0 the point lies on the line.
	 */
	public static float calcPointPositionToLine(float aX, float aY, float bX,
			float bY, float cX, float cY) {
		float result = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		return result;
	}

}
