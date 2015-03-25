package oop;

public class Test {

	private boolean male = false;
	private int weight = 0;
	
	public Test(){
		this(false);
	}
	
	public Test(boolean male){
		this(male, 1);
	}
	
	public Test(boolean male, int weight){
		this.male = male;
		this.weight = weight;
	}
	
	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		
	}

}
