package Homeworks.intro;

import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfStr = input.nextInt();
		input.nextLine();
		String[] strArray = new String[numberOfStr];
		
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = input.nextLine();
		}
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].compareToIgnoreCase(strArray[j]) > 0) {
					String tempStr = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = tempStr;
				}
			}
		}
		input.close();
		for (String string : strArray) {
			System.out.println(string);
		}
		

	}

}
