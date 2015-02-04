package Homeworks.collections;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cards = input.nextLine();
		Pattern pattern = Pattern.compile("[JQKA0-9]+");
		Matcher matcher = pattern.matcher(cards);
		Map<String, Integer> faces = new LinkedHashMap<String, Integer>();
		double countCards = 0;
		while (matcher.find()) {
			countCards++;
			String cardFace = matcher.group();
			if (!faces.containsKey(cardFace)) {
				faces.put(cardFace, 1);
			} else {
				int oldValue = faces.get(cardFace);
				faces.put(cardFace, oldValue + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : faces.entrySet()) {
			double percentage = (entry.getValue()/countCards)*100;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
		}
	}

}
