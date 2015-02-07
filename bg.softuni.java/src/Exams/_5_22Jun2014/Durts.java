package Exams._5_22Jun2014;

import java.util.Scanner;

public class Durts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int Cx = input.nextInt();
		int Cy = input.nextInt();
		
		double radius = input.nextDouble();
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {
			String isInTheTarget = "no";
			int pointX = input.nextInt();
			int pointY = input.nextInt();
			//check horizontal rectangle
			if (pointX >= Cx - radius && pointX <= Cx + radius) {
				if (pointY >= Cy - radius/2 && pointY <= Cy + radius/2) {
					isInTheTarget = "yes";
				}
			} 
			if (pointY >= Cy - radius && pointY <= Cy + radius && isInTheTarget.equals("no")) {
				if (pointX >= Cx - radius/2 && pointX <= Cx + radius/2) {
					isInTheTarget = "yes";
				}

			} 
			System.out.println(isInTheTarget);
		}
	}

}
