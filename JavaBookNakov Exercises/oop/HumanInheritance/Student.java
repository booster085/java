package oop.HumanInheritance;

public class Student extends Human implements Comparable<Student> {

	private Double evaluation;

	public double getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Double evaluation) {
		this.evaluation = evaluation;
	}

	public Student(String firstName, String lastName, Double evaluation) {
		super(firstName, lastName);
		this.evaluation = evaluation;
	}

	public Student() {
		super();
	}

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public int compareTo(Student student) {
		int result = this.evaluation.compareTo(student.evaluation);
		return result;
	}

}
