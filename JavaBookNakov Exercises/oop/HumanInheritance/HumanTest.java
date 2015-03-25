package oop.HumanInheritance;

import java.util.Arrays;

public class HumanTest {

	public static void main(String[] args) {

		Student[] students = new Student[] {
				new Student("Georgi", "Ivanov", 4.5),
				new Student("Ivan", "Ivanov", 5.0),
				new Student("Metodi", "Popov", 4.2),
				new Student("Geri", "Mincheva", 3.8),
				new Student("Milena", "Velinova", 5.6),
				new Student("Misho", "Mishkin", 6.0),
				new Student("Veneta", "Kotova", 4.0),
				new Student("Spas", "Masov", 4.25),
				new Student("Petyr", "Revin", 5.34),
				new Student("Krisi", "Terzieva", 5.0), };

		// Sort Array Variant with Selection sort algorithm

		for (int i = 0; i < students.length - 1; i++) {
			for (int k = i + 1; k < students.length; k++) {
				int equal = students[i].compareTo(students[k]);
				if (equal == 1) {
					Student temp = students[i];
					students[i] = students[k];
					students[k] = temp;
				}
			}

		}
		for (Student student : students) {
			System.out.println(student + " " + student.getEvaluation());
		}

		Worker[] workers = new Worker[] {
				new Worker("Georgi", "Ivanov", 1, 68.0),
				new Worker("Ivan", "Ivanov", 2, 55.0),
				new Worker("Metodi", "Popov", 3, 34.2),
				new Worker("Geri", "Mincheva", 4, 63.8),
				new Worker("Milena", "Velinova", 5, 85.6),
				new Worker("Misho", "Mishkin", 6, 56.0),
				new Worker("Veneta", "Kotova", 7, 40.0),
				new Worker("Spas", "Masov", 8, 40.25),
				new Worker("Petyr", "Revin", 9, 57.34),
				new Worker("Krisi", "Terzieva", 10, 50.0), };

		// Sort Array Variant with Arrays.sort function (uses the overridden
		// compareTo() method in class Worker

		Arrays.sort(workers);
		for (Worker worker : workers) {
			System.out.println(worker + " " + worker.getWage());
		}

	}

}
