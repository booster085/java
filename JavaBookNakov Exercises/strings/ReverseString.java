package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text");

		String inputText = input.nextLine();
		StringBuilder revText = new StringBuilder();
		
		for (int i = inputText.length() - 1; i >= 0; i--) {
			revText.append(inputText.charAt(i));
		}
		System.out.println(revText);
	}

}
