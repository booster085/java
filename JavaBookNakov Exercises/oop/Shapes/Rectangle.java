package oop.Shapes;

public class Rectangle extends Shape {
	
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(Double width, Double height) {
		super(width, height);
	}

	@Override
	public Double calculateSurface(){
		if (null != getHeight() && null != getWidth()) {
			return getHeight() * getWidth();
		}
		return null;
	}
}
