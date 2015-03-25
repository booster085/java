package oop.HumanInheritance;

public class Worker extends Human implements Comparable<Worker> {

	private int workHours;
	private Double wage; // daily payment
	
	

	public Worker() {
		super();
	}

	public Worker(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Worker(String firstName, String lastName, int workHours, Double wage) {
		super(firstName, lastName);
		this.workHours = workHours;
		this.wage = wage;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}
	
	public double calcPaymentPerHour(){
		return wage / workHours;
	}

	@Override
	public int compareTo(Worker other) {
		return this.wage.compareTo(other.wage);
	}

}
