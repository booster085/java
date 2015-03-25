package oop.Shapes;

public abstract class Shape {

	private Double width;
	private Double height;

	public Shape() {
		super();
	}

	public Shape(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public abstract Double calculateSurface();
}
