package Exams._4_3Sept2014;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ActivityTracker {

	public static void main(String[] args) {
//	TreeMap<Integer, TreeMap<String, Integer>>
		Scanner input = new Scanner(System.in);
		int numberOfLines = input.nextInt();
		input.nextLine();
		Map<Integer, TreeMap<String, Integer>> travels = new TreeMap<Integer, TreeMap<String, Integer>>();
		for (int i = 0; i < numberOfLines; i++) {
			String[] line = input.nextLine().split("\\s+");
			int month = Integer.parseInt(line[0].substring(3, 5));
			String name = line[1];
			Integer distance = Integer.parseInt(line[2]);
			if (!travels.containsKey(month)) {
				travels.put(month, new TreeMap<String, Integer>());
				travels.get(month).put(name, distance);
			} else {
				if (!travels.get(month).containsKey(name)) {
					travels.get(month).put(name, distance);
				} else {
					int oldValue = travels.get(month).get(name);
					travels.get(month).put(name, oldValue + distance);
				}
			}
		}
		for (Integer month : travels.keySet()) {
			String result = month + ": ";
			for (String name : travels.get(month).keySet()) {
				result += name +"(" + travels.get(month).get(name) + "), ";
			}
			System.out.println(result.substring(0, result.length() - 2));
		}

	}

}
