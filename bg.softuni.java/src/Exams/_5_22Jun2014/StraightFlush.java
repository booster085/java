package Exams._5_22Jun2014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StraightFlush {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] inputCards = input.nextLine().split("\\W+");
		Set<String> cards = new HashSet<String>();
		cards.addAll(Arrays.asList(inputCards));
		boolean isStraightFlush = false;
		for (int i = 0; i < inputCards.length; i++) {
			ArrayList<String> straightFlush = new ArrayList<>();
			String cardFace = getFace(inputCards[i]);
			String cardSuit = getSuit(inputCards[i]);
			for (int j = 0; j < 5; j++) {
				String card = cardFace + cardSuit;
				straightFlush.add(card);
				cardFace = generateNextCard(cardFace);
			}
			if (cards.containsAll(straightFlush)) {
				System.out.println(straightFlush);
				isStraightFlush = true;
			}
		}
		if (!isStraightFlush) {
			System.out.println("No Straight Flushes");
		}

	}
	public static String generateNextCard(String cardFace){
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		for (int i = 1; i < faces.length; i++) {
			if (faces[i - 1].equals(cardFace)) {
				return faces[i];
			}
		}
		return null;
	}

	public static String getSuit(String card) {
		return card.substring(card.length() - 1);
	}
	public static String getFace(String card){
		return card.substring(0, card.length() - 1);
	}
}
