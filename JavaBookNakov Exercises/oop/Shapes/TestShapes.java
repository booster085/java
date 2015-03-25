package oop.Shapes;

public class TestShapes {

	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(4.0, 5.0);
		Triangle myTriangle = new Triangle(4.0, 5.0);
		System.out.println(myTriangle.calculateSurface());
		System.out.println(myRectangle.calculateSurface());
		Circle myCircle = new Circle(5.0);
		System.out.printf("%.02f", myCircle.calculateSurface());

	}

}
