package Exams._4_3Sept2014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Biggest3PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		Pattern pattern = Pattern.compile("[0-9-]+");
		Matcher matcher = pattern.matcher(line);
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		boolean isPrime; 
		while(matcher.find()) {
			isPrime = true;
			int number = Integer.parseInt(matcher.group());
			if (number > 1 ) {
				for (int i = 2; i <= Math.sqrt(number); i++) {
					if (number % i == 0) {
						isPrime = false;
						break;
					} 
				}
				if (isPrime && !numbersList.contains(number)) {
					numbersList.add(number);
				}

			}
						
		}
		Collections.sort(numbersList);
		if (numbersList.size() > 2) {
			int sum = numbersList.get(numbersList.size() - 1) + 
					numbersList.get(numbersList.size() - 2) +
					numbersList.get(numbersList.size() - 3);
			System.out.println(sum);
		} else {
			System.out.println("No");
		}
		
	}

}
