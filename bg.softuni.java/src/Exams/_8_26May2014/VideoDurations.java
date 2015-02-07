package Exams._8_26May2014;

import java.util.Scanner;

public class VideoDurations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		int hoursTotal = 0;
		int minutesTotal = 0;
		while (!line.equals("End")) {
			String[]times = line.split("\\D+");
			int hours = Integer.parseInt(times[0]);
			int minutes = Integer.parseInt(times[1]);
			minutesTotal += minutes;
			hoursTotal += hours;  
			line = input.nextLine();
		}
		hoursTotal += minutesTotal/60;
		minutesTotal = minutesTotal%60;
		System.out.printf("%d:%02d", hoursTotal, minutesTotal);

	}

}
