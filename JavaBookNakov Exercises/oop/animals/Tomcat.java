package oop.animals;

public class Tomcat extends Cat {

	public Tomcat() {
		super("Tomcat");
	}

	public Tomcat(String name, int age, String male) {
		super(name, age, male);
	}

	public Tomcat(String name, int age) {
		super(name, age);
	}

	public Tomcat(String name) {
		super(name);
	}
}
