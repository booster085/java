package loops;

public class PrintAllCards {

	public static void main(String[] args) {
		
		char[] suits = {'♠', '♥', '♦', '♣'};
		String [] deck = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < deck.length; j++) {
				System.out.print(deck[j] + suits[i] + "  ");
			}
			System.out.println();
		}

	}

}
