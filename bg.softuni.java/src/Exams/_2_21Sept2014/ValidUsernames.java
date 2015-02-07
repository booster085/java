package Exams._2_21Sept2014;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String line = input.nextLine();
		Pattern pattern = Pattern.compile("\\b[A-Za-z][\\w]{2,25}\\b");
		Matcher matcher = pattern.matcher(line);
		ArrayList<String> usernames = new ArrayList<String>();
		while (matcher.find()) {
			usernames.add(matcher.group());
		}
		int maxSum = 0;
		String firstName = "";
		String secondName = "";
		for (int i = 0; i < usernames.size() - 1; i++) {
			int tempSum = usernames.get(i).length() + usernames.get(i + 1).length();
			if (tempSum > maxSum) {
				maxSum = tempSum;
				firstName = usernames.get(i);
				secondName = usernames.get(i+1);
			}
		}
		System.out.println(firstName);
		System.out.println(secondName);
	}

}
