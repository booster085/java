package objects.chapter10;

public class Cat {
	
	private String name;
	
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//Default constructor
	public Cat(){
		this.name = "Pussycat";
		this.color = "black";
	}
	
	public Cat(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public void sayMrrr() {
		System.out.printf("The %s %s said: Mrrrrr!%n",color, name);
	}

}
