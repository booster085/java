package Homeworks.loops_methods.Products;

import java.math.BigDecimal;

public class Product {

	private String name;
	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	// overrides print method
	@Override
	public String toString() {
		return String.format("%.2f %s", this.getPrice(), this.getName());
	}

}
