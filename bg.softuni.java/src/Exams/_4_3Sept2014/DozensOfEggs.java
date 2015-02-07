package Exams._4_3Sept2014;

import java.util.Scanner;

public class DozensOfEggs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int totalEggs = 0;
		for (int i = 0; i < 7; i++) {
			String[] line = input.nextLine().split("\\s+");
			int count = Integer.parseInt(line[0]);
			if (line[1].equals("dozens")) {
				totalEggs += count*12;
			} else {
				totalEggs += count;
			}
		}
		int dozens = totalEggs/12;
		int eggs = totalEggs%12;
		System.out.printf("%d dozens + %d eggs", dozens, eggs);
	}

}
