package classes;

import classes.Student.University;
import classes.Student.Specialty;
import classes.Student;

public class StudentTest {

	private Student stu1;
	private Student stu2;
	private Student stu3;

	public void createStudents() {
		stu1 = new Student("Filip Mihailov", University.UNWE, "first",
				Specialty.FINANCE);
		stu2 = new Student("Mihaela Fileva", University.MVBU, "second",
				Specialty.ACCOUNTING);
		stu3 = new Student("Qne Sandanski", University.ALMAMATER, "fourth",
				Specialty.IT);
	}

	public Student getStudent(int stu) {
		Student student;
		switch (stu) {
		case 1:
			student = stu1;
			break;
		case 2:
			student = stu2;
			break;
		case 3:
			student = stu3;
			break;
		default:
			student = null;
			break;
		}
		return student;
	}

	/**
	 * Добавете статичен метод в класа StudentTest, който създава няколко обекта
	 * от тип Student и ги съхранява в статични полета. Създайте статично
	 * свойство на класа, което да ги достъпва. Напишете тестова програма, която
	 * да извежда информацията за тях в конзолата.
	 */

}
