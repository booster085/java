package Homeworks.collections;

import java.util.Scanner;

public class CountSubsttingOccurences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		String subString = input.next().toLowerCase();
		int occurrences = -1;
		int indexOfWord = 0;
		int index = 0;
		while(indexOfWord != -1) {
			indexOfWord =  text.indexOf(subString, index);
			occurrences++;
			index = indexOfWord + 1;
		}
		System.out.println(occurrences);
	}

}
