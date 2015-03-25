package oop.animals;

public class Frog extends Animals{

	
	public Frog() {
		super("Frog");
	}

	public Frog(String name, int age, String male) {
		super(name, age, male);
	}

	public Frog(String name, int age) {
		super(name, age);
	}

	public Frog(String name) {
		super(name);
	}

	@Override
	public void makeSound(){
		System.out.print("\tKwak - kwak!\n");
	}
	
}
