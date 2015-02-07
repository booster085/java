package Exams._1_7Jan2015;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SchoolSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		Map<String, TreeMap<String, ArrayList<Double>>> studentGradesList = new TreeMap<String, TreeMap<String, ArrayList<Double>>>();
		for(int i = 0; i < n; i++){
			String[] line = input.nextLine().split("\\s+");
			String fullName = line[0] + " " + line[1];
			String subject = line[2];
			Double grade = Double.parseDouble(line[3]);
			ArrayList<Double> grades = new ArrayList<Double>();
			TreeMap<String, ArrayList<Double>> subjectsList = new TreeMap<String, ArrayList<Double>>();
			if (!studentGradesList.containsKey(fullName)) {
				grades.add(grade);
				subjectsList.put(subject, grades);
				studentGradesList.put(fullName, subjectsList);
			} else {
				if (!studentGradesList.get(fullName).containsKey(subject)) {
					grades.add(grade);
					studentGradesList.get(fullName).put(subject, grades);
				} else {
					studentGradesList.get(fullName).get(subject).add(grade);
				}
			}
		}
		for (String name : studentGradesList.keySet()) {
			System.out.printf("%s: [", name);
			byte counter = 1;
			int numberOfSubjects = studentGradesList.get(name).size();
			for (String subject : studentGradesList.get(name).keySet()) {
				Double sum = 0.0;
				for (Double grade : studentGradesList.get(name).get(subject)) {
					sum += grade;
				}
				Double avg = sum/studentGradesList.get(name).get(subject).size();
				System.out.printf("%s - %.2f", subject, avg);
				if (counter < numberOfSubjects) {
					System.out.print(", ");
				} else {
					System.out.print("]");
				}
				counter++;
			}
			System.out.println();
		}
	}
	

}
