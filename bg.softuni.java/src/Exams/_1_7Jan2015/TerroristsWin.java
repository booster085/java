package Exams._1_7Jan2015;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerroristsWin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String line = input.nextLine();

		Pattern pattern = Pattern.compile("\\|(.*?)\\|");
		Matcher matcher = pattern.matcher(line);

		while (matcher.find()) {
			String bomb = matcher.group();
			int bombPower = 0;
			for (int i = 1; i < bomb.length() - 1; i++) {
				bombPower += (bomb.charAt(i));
			}
			bombPower %= 10;
			Pattern bombArea = Pattern.compile(".{0," + bombPower
					+ "}\\|(.*?)\\|.{0," + bombPower + "}");
			Matcher matchBombArea = bombArea.matcher(line);
			if (matchBombArea.find()) {
				String area = matchBombArea.group();
				String dots = area.replaceAll(".", "\\.");
				line = line.replace(area, dots);
			}
		}
		System.out.println(line);

	}

}
