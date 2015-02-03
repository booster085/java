package Homeworks.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] words = input.nextLine().split("\\W+");
		Set<String> resultSet = new TreeSet<String>();
		for (int i = 0; i < words.length; i++) {
			resultSet.add(words[i].toLowerCase());
		}
		for (String string : resultSet) {
			System.out.print(string + " ");
		}

	}

}
