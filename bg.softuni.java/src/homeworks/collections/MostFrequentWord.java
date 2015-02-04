package Homeworks.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("\\W+");
		Map<String, Integer> wordRepeating = new TreeMap<String, Integer>();
		int maxCount = 1;
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			
			if(wordRepeating.containsKey(word)){
				int occurrences = wordRepeating.get(word);
				wordRepeating.put(word, occurrences + 1);
				occurrences++;
				if (maxCount < occurrences) {
					maxCount = occurrences;
				}
			} else {
				wordRepeating.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : wordRepeating.entrySet()) {
			//Print entry.set only if value is equal to max occurrences of the word
			//The alphabetically order is implemented by TreeSet structure
			if (entry.getValue() == maxCount) {
				System.out.printf("%s -> %d times\n", entry.getKey(), entry.getValue());
			}
			
		}
			
		

	}
}
