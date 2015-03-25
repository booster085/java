package oop.animals;

public class Dog extends Animals{
	

	public Dog() {
		super("Dog");	
	}

	public Dog(String name, int age, String male) {
		super(name, age, male);	
	}

	public Dog(String name, int age) {
		super(name, age);	
	}

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.print("\tBay-bay!\n");
		
	}

}
