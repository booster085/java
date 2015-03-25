package oop.animals;

public class AnimalsTest {

	public static void main(String[] args) {
		
		Dog sharo = new Dog("Sharo", 3, "male");
		System.out.print(sharo);
		sharo.makeSound();
		Kitten maxcho = new Kitten("Maxcho", 1);
		Cat lucky = new Tomcat("Lucky", 6, "female");
		System.out.print(maxcho);
		maxcho.makeSound();
		System.out.print(lucky);
		lucky.makeSound();
		Cat kurmit = new Cat();
		System.out.print(kurmit);
		kurmit.makeSound();

	}

}
