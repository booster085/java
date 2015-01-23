package homeworks.loops_methods;

import java.util.Scanner;

public class Generate3LetterWord {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter characters:");
		
		char[] letters =  input.nextLine().toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				for (int k = 0; k < letters.length; k++) {
					System.out.println("" + letters[i] + letters[j] + letters[k]);
				}	
			}
		}
	}

}
