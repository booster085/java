package Exams._5_22Jun2014;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CognateWords {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String[] words = input.nextLine().split("[^a-zA-Z]+");
		boolean isThereCognateWords = false;
		String result;
		Set<String> outputs = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				for (int k = 0; k < words.length; k++) {
					if (((words[i] + words[j]).equals(words[k]) && i != j)) {
						result = String.format("%s|%s=%s", words[i], words[j], words[k]);
						outputs.add(result);
						isThereCognateWords = true;
					}
				}
			}
		}
		if (isThereCognateWords) {
			for (String string : outputs) {
				System.out.println(string);
			}
		} else {
			System.out.println("No");
		}
	}

}
