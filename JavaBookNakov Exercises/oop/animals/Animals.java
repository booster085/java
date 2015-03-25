package oop.animals;

public abstract class Animals {

	private String name;
	private int age;
	private String male;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}
	
	public Animals(){
		this(null);
	}
	
	public Animals(String name){
		this(name, 0);
	}
	
	public Animals(String name, int age){
		this(name, age, null);
	}
	
	public Animals(String name, int age, String male){
		this.name = name;
		this.age = age;
		this.male = male;
	}
	
	@Override
	public String toString(){
		return String.format("%s is %d years old. ", this.name, this.age);
	}
	
	public abstract void makeSound();

}
