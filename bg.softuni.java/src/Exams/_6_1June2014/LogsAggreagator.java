package Exams._6_1June2014;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggreagator {

	public static void main(String[] args) {
//		TreeMap<String, TreeMap<String, Integer>>
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		Map<String, TreeMap<String, Integer>> logsList = new TreeMap<String, TreeMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] line = input.nextLine().split("\\s+");
			String IP = line[0];
			String name = line[1];
			int duration = Integer.parseInt(line[2]);
			if (!logsList.containsKey(name)) {
				logsList.put(name, new TreeMap<String, Integer>());
				logsList.get(name).put(IP, duration);
			} else {
				if (!logsList.get(name).containsKey(IP)) {
					logsList.get(name).put(IP, duration);
				} else {
					int oldValue = logsList.get(name).get(IP);
					logsList.get(name).put(IP, oldValue + duration);
				}
			}
		}
		for (String name : logsList.keySet()) {
			int durationSum = 0;
			String output = name + ": ";
				for (Integer duration : logsList.get(name).values()) {
					durationSum += duration;
				}
				output += durationSum + " [";
				for (String IP : logsList.get(name).keySet()) {
					output += IP + ", ";
				}
			System.out.println(output.substring(0, output.length() - 2) + "]");
		}

	}

}
