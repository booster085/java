package Exams._2_21Sept2014;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OfficeStuff {

	public static void main(String[] args) {
//		TreeMap<String, LinkedHashMap<String, Integer>>
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		Map<String, LinkedHashMap<String, Integer>> orders = new TreeMap<String, LinkedHashMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] line = input.nextLine().trim().split("\\W+");
			String company = line[1];
			String product = line[3];
			Integer ammount = Integer.parseInt(line[2]);
			if (!orders.containsKey(company)) {
				orders.put(company, new LinkedHashMap<String, Integer>());
				orders.get(company).put(product, ammount);
			} else {
				if (orders.get(company).containsKey(product)) {
					int oldAmmount = orders.get(company).get(product);
					orders.get(company).put(product, oldAmmount + ammount);
				} else {
					orders.get(company).put(product, ammount);
				}
			}
		}
		for (String company : orders.keySet()) {
			String result = company + ": ";
			for (String product : orders.get(company).keySet()) {
				result += product + "-" + orders.get(company).get(product) + ", ";
			}
			System.out.println(result.substring(0, result.length() - 2));
		}

	}

}
