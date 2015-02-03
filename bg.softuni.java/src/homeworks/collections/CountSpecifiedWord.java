package Homeworks.collections;

import java.util.Scanner;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] textArray = input.nextLine().split("\\W+");
		String searchedWord = input.next();
		int occurrences = 0;
		for (String string : textArray) {
			if (searchedWord.equalsIgnoreCase(string)) {
				occurrences++;
			}
		}
		System.out.println(occurrences);
	}

}
