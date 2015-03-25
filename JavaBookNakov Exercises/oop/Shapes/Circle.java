package oop.Shapes;

/**
 * @author Azbe
 *
 */
public class Circle extends Shape {
	
	

	public Circle() {
		super();
	}

	public Circle(Double radius) {
		super(radius, radius);
	}

	@Override
	public Double calculateSurface() {
		if (null != getHeight()) {
			return Math.PI * getHeight() * getHeight();
		}
		return null;
	}
	
	

}
