package Homeworks.loops_methods;

public class FullHouse {
	
	/**
	 * 
	 * @param card1 - first card
	 * @param card2 - second card
	 * @return - if card's last index (suit) is equal or not
	 */
	static boolean checkSuitIfEqual(String card1, String card2) {
		if (card1.charAt(card1.length() - 1)
				== card2.charAt(card2.length() - 1)) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param suit1 - first card
	 * @param suit2 - second card
	 * @return - if card's first index (face) is equal or not
	 */
	static boolean checkFaceIfEqual(String card1, String card2) {
		if (card1.charAt(0) == card2.charAt(0)) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2660', '\u2665' };
		int counter = 0;
	
		// First create array with 52cards

		String[] cards = new String[52];
		byte index = 0;
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards[index] = faces[i] + suits[j];
				index++;
			}
		}
		//First 3 cards from the same face 
		for (int i = 0; i < cards.length; i++) {
			for (int j = i + 1; j < cards.length; j++) {
				//Check if face is equal and suit different
				if (checkFaceIfEqual(cards[i], cards[j])
						&& !checkSuitIfEqual(cards[i], cards[j])) {
					for (int k = j + 1; k < cards.length; k++) {
						if (checkFaceIfEqual(cards[j], cards[k])
								&& !checkSuitIfEqual(cards[i], cards[k])
								&& !checkSuitIfEqual(cards[j], cards[k])) {
							//As we have 3 cards from the same face and different suit
							//start to iterate the other pair of cards 
							for (int l = 0; l < cards.length; l++) {
								for (int m = l + 1; m < cards.length; m++) {
									//Last 2 cards must be same face but different suits
									//and different face from previous three cards 
									if (checkFaceIfEqual(cards[l], cards[m])
											&& !checkFaceIfEqual(cards[l], cards[k])
											&& !checkSuitIfEqual(cards[l], cards[m])) {
										System.out.printf(
												"(%1$s %2$s %3$s %4$s %5$s)\n",
												cards[i], cards[j], cards[k],
												cards[l], cards[m]);
										counter++;
									}
								}

							}

						}
					}
				}
			}
		}
		System.out.println(counter + " full houses");
	}
}
