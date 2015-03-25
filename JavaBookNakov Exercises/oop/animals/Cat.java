package oop.animals;
/**
 * 759 str.
 * @author Azbe
 *
 */
public class Cat extends Animals {
	
	public Cat() {
		super("Cat");
	}

	public Cat(String name, int age, String male) {
		super(name, age, male);
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.print("Miau - Miau!\n");
		
	}


}
