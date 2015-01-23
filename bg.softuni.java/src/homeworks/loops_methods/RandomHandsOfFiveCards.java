package homeworks.loops_methods;

import java.util.Random;
import java.util.Scanner;

public class RandomHandsOfFiveCards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2660', '\u2665' };
		
		int numberOfHands = input.nextInt();

		for (int i = 0; i < numberOfHands; i++) {
			for (int j = 0; j < 5; j++) {
				int rndFace = rnd.nextInt(faces.length);
				int rndSuit = rnd.nextInt(suits.length);
				System.out.print(faces[rndFace] + suits[rndSuit] + " ");
			}
			System.out.println();
		}
	}

}
