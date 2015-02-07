package Exams._3_21SeptEv2014;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nuts {

	public static void main(String[] args) {
//  TreeMap<String, LinkedHashMap<String, Integer>>
		Scanner input = new Scanner(System.in);
		
		int numberOfLines = input.nextInt();
		input.nextLine();
		Map<String, LinkedHashMap<String, Integer>> orders = new TreeMap<String, LinkedHashMap<String, Integer>>();
		for (int i = 0; i < numberOfLines; i++) {
			String[] words = input.nextLine().trim().split("\\s+");
			String company = words[0];
			String nuts = words[1];
			int indexBeforeKg = words[2].length() - 2;
			Integer kgs = Integer.parseInt(words[2].substring(0, indexBeforeKg));
			if (!orders.containsKey(company)) {
				orders.put(company, new LinkedHashMap<String, Integer>());
				orders.get(company).put(nuts, kgs);
			} else {
				if (!orders.get(company).containsKey(nuts)) {
					orders.get(company).put(nuts, kgs);
				} else {
					int oldQuantity = orders.get(company).get(nuts);
					orders.get(company).put(nuts, oldQuantity + kgs);
				}
			}
		}
		for (String company : orders.keySet()) {
			String output = company + ": ";
			for (String nuts : orders.get(company).keySet()) {
				output += nuts + "-" + orders.get(company).get(nuts) + "kg, ";
			}
			System.out.println(output.substring(0, output.length() - 2));
		}
		

	}

}
