package oop;

public class Test2 extends Test {
	
	public Test2(boolean male, int weight){
		super(male, weight);
	}
	
	@Override
	public String toString(){
		return String.format("Test2 is %s, it's weght is %s", 
				this.isMale(), this.getWeight());
	}
	public static void main(String[] args){
		Test2 trop = new Test2(true, 24);
		System.out.println(trop);
		
	}
}
