package oop.Shapes;

public class Triangle extends Shape {
	
	
	public Triangle() {
		super();
	}

	public Triangle(Double width, Double height) {
		super(width, height);
	}

	@Override
	public Double calculateSurface() {
		if (null != getHeight() && null != getWidth()) {
			return (getHeight() * getWidth())/2;
		}
		return null;
	}

}
