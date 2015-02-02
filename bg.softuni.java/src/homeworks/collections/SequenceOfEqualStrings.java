package Homeworks.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String[] wordsArray = line.split("\\s+");
		for (int i = 0; i < wordsArray.length; i++) {
			System.out.print(wordsArray[i]);
			for (int j = i + 1; j < wordsArray.length; j++) {
				if (wordsArray[i].equals(wordsArray[j])) {
					System.out.print(" " + wordsArray[j]);
					i++;
				} 
			}
			System.out.println();
			
		}
	}

}
