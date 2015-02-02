package Homeworks.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String line = input.nextLine();
		String[] strNumbers = line.split("\\s+");

		ArrayList<Integer> allNumbers = new ArrayList();
		int maxSequence = 1;
		String longestSequence = "";
		for (int i = 0; i < strNumbers.length - 1; i++) {
			int currentNum = Integer.parseInt(strNumbers[i]);
			int nextNum = Integer.parseInt(strNumbers[i + 1]);
			allNumbers.add(currentNum);
			int index = allNumbers.size() - 1;
			if (i == strNumbers.length - 2 && nextNum > currentNum) {
				allNumbers.add(nextNum);
			}

			if (allNumbers.get(index) >= nextNum || i == strNumbers.length - 2) {
				String result = allNumbers.toString().replace("[", "").replace("]", "").replace(",", "");
				System.out.println(result);
				if (maxSequence < allNumbers.size()) {
					maxSequence = allNumbers.size();
					longestSequence = result;
				}
				allNumbers.clear();
			}
			
		}
		if (maxSequence > 1) {
			System.out.println("Longest: " + longestSequence);
		}
		

	}

}
