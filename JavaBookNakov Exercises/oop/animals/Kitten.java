package oop.animals;

public class Kitten extends Cat {

	public Kitten() {
		super("Kitten");
	}

	public Kitten(String name, int age, String male) {
		super(name, age, male);
	}

	public Kitten(String name, int age) {
		super(name, age);
	}

	public Kitten(String name) {
		super(name);
	}

}
