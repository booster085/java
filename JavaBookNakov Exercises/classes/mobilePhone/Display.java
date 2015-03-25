package classes.mobilePhone;

/**
 * характеристики на екрана (големина и цветове).
 * 
 * @author Ilian
 *
 */

public class Display {

	private String size = null;
	private String colors = null;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public Display() {
		this("N/D");
	}

	public Display(String size) {
		this(size, "N/D");
	}

	public Display(String size, String colors) {
		this.size = size;
		this.colors = colors;
	}
}
