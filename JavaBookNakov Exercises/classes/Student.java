package classes;

public class Student {

	public enum Specialty {
		ARCHITECTURE, IT, LOW, PHILOSOPHY, ACCOUNTING, FINANCE, AIRTRANSPORT; 
	};
	public enum University {
		TECHUN, ALMAMATER, UNWE, MVBU;
	}
	
	private static int counter = 0;
	public static int getCounter() {
		return counter;
	}

	private String name = null;
	private String course = null;
	private String email = null;
	private long phoneNum = 0;
	private Specialty specialty = null;
	private University university = null;
	
	public String getName() {
		return name;
	}

	public void setName(String names) {
		this.name = names;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Specialty getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public University getUniversity() {
		return university;
	}
	
	public Student(){
		this(null);
	}
	
	public Student(String names){
		this(names, null);
	}
	
	public Student(String names, University university){
		this(names, university, null);
	}
	
	public Student(String names, University university, String course){
		this(names, university, course, null);
	}
	
	public Student(String names, University university, String course, Specialty specialty){
		this(names, university, course, specialty, null);
	}
	
	public Student(String names, University university, String course, Specialty specialty, String email){
		this(names, university, course, specialty, email, 0);
	}
	
	public Student(String names, University university, String course, Specialty specialty, String email, long phone){
		this.name = names;
		this.university = university;
		this.course = course;
		this.specialty = specialty;
		this.email = email;
		this.phoneNum = phone;
		counter++;
	}
	
	static void printStudentInfo(Student st){
		System.out.printf("Student Information\n"
				+ "Name: %s\n"
				+ "University: %s\n"
				+ "Course: %s\n"
				+ "Specialty: %s\n"
				+ "email: %s\n"
				+ "Phone: %d\n",
				st.getName(), st.getUniversity(), st.getCourse(), st.getSpecialty(), st.getEmail(), st.getPhoneNum());
	}

}
