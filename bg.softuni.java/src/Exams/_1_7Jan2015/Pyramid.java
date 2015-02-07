package Exams._1_7Jan2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String output = input.nextLine().trim();
		int currentNum = Integer.parseInt(output);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < n - 1; i++) {
			boolean foundBigger = false;
			String[] numbersStr = input.nextLine().trim().split("\\s+");
			for (int j = 0; j < numbersStr.length; j++) {
				numbers.add(Integer.parseInt(numbersStr[j]));
			}
			Collections.sort(numbers);
			for (int j = 0; j < numbers.size(); j++) {
				if (currentNum < numbers.get(j)) {
					foundBigger = true;
					currentNum = numbers.get(j);
					output += (", " + currentNum);
					break;
				} 
			}
			if (!foundBigger) {
				currentNum++;
			}
			numbers.clear();
			
		}
		System.out.println(output);
		

	}

}
