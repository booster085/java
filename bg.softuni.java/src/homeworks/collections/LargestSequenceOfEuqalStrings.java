package Homeworks.collections;

import java.util.Scanner;

public class LargestSequenceOfEuqalStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int  bestCount = 1;
		int bestEnd = 0;
		
		String line = input.nextLine();
		String[] wordsArray = line.split("\\s+");
		for (int i = 0; i < wordsArray.length; i++) {
			
			int tempCount = 1;
			for (int j = i + 1; j < wordsArray.length; j++) {
				if (wordsArray[i].equals(wordsArray[j])) {
					tempCount++;
					i++;
				} else {
					break;
				}
			}
			if (bestCount < tempCount) {
				bestCount = tempCount;
				bestEnd = i;
				
			}
		}
		for (int i = bestEnd - bestCount + 1; i <= bestEnd; i++) {
			System.out.print(wordsArray[i] + " ");
		} 
	}
}
