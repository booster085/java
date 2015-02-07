package Exams._3_21SeptEv2014;

import java.util.Scanner;

public class TimeSpan {
	public static long makeTimeToSeconds(String[] time) {
		long seconds = Long.parseLong(time[2]);
		int minutesInSeconds = Integer.parseInt(time[1]) * 60;
		long hoursInSeconds = Long.parseLong(time[0]) * 60 * 60;
		seconds += minutesInSeconds + hoursInSeconds;
		return seconds;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] startTime = input.nextLine().trim().split("\\D+");
		String[] endTime = input.nextLine().trim().split("\\D+");
		long resultInSeconds = makeTimeToSeconds(startTime) - makeTimeToSeconds(endTime);
		int hours = (int) (resultInSeconds/3600);
		int minutes = (int)(resultInSeconds%3600/60);
		int seconds = (int)(resultInSeconds%3600%60);
		System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
		
	}

}
