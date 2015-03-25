package if_Else;

public class QuadraticEquation {

	public static void main(String[] args) {
		//ax^2 + bx + c
		double a = -1;
		double b = -2;
		double c = 6;
		double x1;
		double x2;
		double discriminant;
		
		discriminant = Math.sqrt((b * b) - (4 * a * c));
		if (discriminant > 0) {
			x1 = (-b + discriminant) / 2 * a;
			x2 = (-b - discriminant) / 2 * a;
			System.out.printf("x1 = %f%nx2 = %f%n", x1, x2);
		} else if (discriminant == 0) {
			x1 = -b / (2 * a);
			System.out.println("x1/2 = " + x1);
		} else {
			System.out.println("No real roots, D<0");
		}
	}

}
