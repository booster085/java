package Exams._5_22Jun2014;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExamScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextLine();
		input.nextLine();
		input.nextLine();
		String line = input.nextLine();
		Map<Integer, TreeMap<String, Double>> examList = new TreeMap<Integer, TreeMap<String, Double>>();
		while(line.charAt(0) == '|') {
			String [] words = line.trim().split("([|\\s][^A-Za-z0-9])+[|\\s]?");
			String name = words[1];
			int score = Integer.parseInt(words[2]);
			double grade = Double.parseDouble(words[3]);
			if (!examList.containsKey(score)) {
				examList.put(score, new TreeMap<String, Double>());
			} 
			examList.get(score).put(name, grade);
			line = input.nextLine(); 
		}
		for (Integer score : examList.keySet()) {
			String output = score + " -> [";
			double avg = 0;
			for (String name : examList.get(score).keySet()) {
				avg = 0;
				for (Double grade : examList.get(score).values()) {
					avg += grade;
				}
				avg /= examList.get(score).values().size();
				output += name + ", ";
			}
			output = output.substring(0, output.length() - 2) + "]; avg=" + String.format("%.2f", avg);
			System.out.println(output);
			
		}
	}

}
