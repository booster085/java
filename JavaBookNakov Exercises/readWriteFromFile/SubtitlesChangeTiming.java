package readWriteFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * You can enter value for seconds positive or negative. Then read line by line
 * the .srt file. It which must be in format 00:00:00,000 --> 00:00:00,000 Then
 * extract timing as String and change value of seconds. Return result into 2
 * elements ArrayList and replace the hole timing line. In future I can make it
 * work with GUI, directly choosing your subs file to modify.
 * 
 * @author Ilian
 *
 */

public class SubtitlesChangeTiming {

	private static final String INPUT_FILE = "src//readWriteFromFile//santi-godzilla.srt";
	private static final String OUTPUT_FILE = "src//readWriteFromFile//output.srt";
	private static final Pattern REGEX = Pattern.compile("\\d+:\\d+:\\d+,\\d+");
	private static int secondToAdd = 1;

	public static int getSecondToAdd() {
		return secondToAdd;
	}

	public static void setSecondToAdd(int secondToAdd) {
		SubtitlesChangeTiming.secondToAdd = secondToAdd;
	}

	public static void main(String[] args) {

		Scanner input = null;

		Scanner fileInput = null;
		PrintStream fileOutput = null;
		File file = new File(INPUT_FILE);

		try {
			System.out
					.println("Enter seconds positive for delay, negative for rush:");
			input = new Scanner(System.in);
			setSecondToAdd(input.nextInt());
			fileInput = new Scanner(file, "windows-1251");
			fileOutput = new PrintStream(OUTPUT_FILE, "windows-1251");
			String line;
			while (fileInput.hasNext()) {
				line = fileInput.nextLine();
				line = changeTiming(line);
				fileOutput.println(line);
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File not found.");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("Encoding not supported.");
		} finally {
			if (fileInput != null) {
				fileInput.close();
			}
			if (fileOutput != null) {
				fileOutput.close();
			}
			if (input != null) {
				input.close();
			}
		}
		System.out.println("Subtitles successfully corrected!");

	}

	// Add second to the subTiming

	private static String changeSeconds(String time) throws ParseException {
		StringBuilder result = new StringBuilder();
		String strSeconds = time.substring(6, 8);
		String strMinutes = time.substring(3, 5);
		String strHours = time.substring(0, 2);
		Integer seconds = Integer.parseInt(strSeconds);
		Integer minutes = Integer.parseInt(strMinutes);
		Integer hours = Integer.parseInt(strHours);
		// check if someone is not over 59
		seconds += secondToAdd;
		if (seconds > 59) {
			seconds -= 60;
			minutes += 1;
			if (minutes > 59) {
				minutes -= 60;
				hours += 1;
			}
		}
		hours.toString();
		minutes.toString();
		seconds.toString();
		result.append(String.format("%02d", hours));
		result.append(":");
		result.append(String.format("%02d", minutes));
		result.append(":");
		result.append(String.format("%02d", seconds));
		result.append(",");
		result.append(time.substring(9));

		return result.toString();
	}

	private static String changeTiming(String line) {
		Matcher matcher = REGEX.matcher(line);
		ArrayList<String> timingList = new ArrayList<String>();
		int counter = 0;
		while (matcher.find()) {
			try {
				timingList.add(changeSeconds(matcher.group(0)));
				if (counter == 1) {
					line = timingList.get(0) + " --> " + timingList.get(1);
				}
				counter++;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		return line;
	}
}
