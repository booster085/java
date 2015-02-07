package Exams._6_1June2014;

import java.util.Scanner;

public class SumCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] cards = input.nextLine().split("\\W+");
		int sum = 0;
		int[]cardsPoints = new int[cards.length];
		
		for (int i = 0; i < cards.length; i++) {
			cardsPoints[i] = getCardPoints(cards[i]);
		}
		if (cardsPoints.length > 1) {
			if (cardsPoints[0] != cardsPoints[1]) {
				sum += cardsPoints[0];
			} else {
				sum += (cardsPoints[0]*2);
			}
			for (int i = 1; i < cardsPoints.length - 1; i++) {
				if (cardsPoints[i] != cardsPoints[i - 1] && cardsPoints[i] != cardsPoints[i + 1]) {
					sum += cardsPoints[i];
				} else {
					sum += (cardsPoints[i]*2);
				}
				
			}
			if (cardsPoints[cardsPoints.length - 1] != cardsPoints[cardsPoints.length - 2]) {
				sum += cardsPoints[cardsPoints.length - 1];
			} else {
				sum += (cardsPoints[cardsPoints.length - 1]*2);
			}
		} else {
			sum = cardsPoints[0];
		}
		
		System.out.println(sum);

	}
	public static int getCardPoints(String card){
		card = card.substring(0, card.length() - 1);
		try {
			return Integer.parseInt(card);
		} finally {
			switch (card) {
			case "J": return 12;
			case "Q": return 13;
			case "K": return 14;
			case "A": return 15;
			default:
				break;
			}
		}
		
	}

}
