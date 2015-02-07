package Exams._3_21SeptEv2014;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeirdStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine().replaceAll("[\\/()|\\s]+", "");
		Pattern pattern = Pattern.compile("[A-Za-z]+");
		Matcher matcher = pattern.matcher(line);
		int maxWeight = 0;
		ArrayList<String> words = new ArrayList<String>();
		while(matcher.find()){
			words.add(matcher.group());
		}
		int firstWordIndex = 0;
		for (int i = 0; i < words.size() - 1; i++) {
			int tempWeight = 0; 
			tempWeight = calcWordWeight(words.get(i)) + calcWordWeight(words.get(i+1));
			if (tempWeight >= maxWeight) {
				maxWeight = tempWeight;
				firstWordIndex = i;
			}
		}
		System.out.printf("%s\n%s", words.get(firstWordIndex), words.get(firstWordIndex + 1));
			
	}
	public static int calcWordWeight(String word) {
		int weight = 0;
		for (int j = 0; j < word.length(); j++) {
			weight += word.toLowerCase().charAt(j) - 96; 
		}
		return weight;
	}

}
