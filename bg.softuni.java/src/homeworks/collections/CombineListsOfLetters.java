package Homeworks.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Character> charArrayLine1 = new ArrayList<Character>();
		ArrayList<Character> charArrayFinal = new ArrayList<Character>();
		String line1 = input.nextLine();
		String line2 = input.nextLine();
		for (int i = 0; i < line1.length(); i+=2) {
			charArrayLine1.add(line1.charAt(i));
		}
		charArrayFinal = (ArrayList<Character>) charArrayLine1.clone();
		for (int i = 0; i < line2.length(); i+=2) {
			if (!charArrayLine1.contains(line2.charAt(i))) {
				charArrayFinal.add(line2.charAt(i));
			}
		}
		System.out.println();
		for (Character character : charArrayFinal) {
			System.out.print(character + " ");
		}
//		System.out.println(charArray.toString().replaceAll("[\\[\\],]", ""));
	}
	
}
