package Homeworks.loops_methods;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		long days = 0;
		try {
			Date startDate = sdf.parse(input.nextLine());
			Date endDate = sdf.parse(input.nextLine());
			days = endDate.getTime() - startDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//Days is in milliseconds so we calculate the days
		System.out.printf("%.0f", (double)days / (1000 * 60 * 60 * 24));

	}

}
