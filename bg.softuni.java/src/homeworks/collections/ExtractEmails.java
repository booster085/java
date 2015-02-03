package Homeworks.collections;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		//It took me just two hours to write this
		String regex = "\\b[a-z0-9][a-z-_\\.]+@[a-z]+\\.*[a-z\\.-]*\\w";
		Pattern emailPattern = Pattern.compile(regex);
		Matcher matcher = emailPattern.matcher(text); 
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
