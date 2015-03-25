package readWriteFromFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class NamesReadSortWrite {

	public static void main(String[] args) {

		String readFileName = "src//readWriteFromFile//test.txt";
		String writeFileName = "src//readWriteFromFile//sortedNames.txt";
		Scanner fileRead = null;
		PrintStream fileWrite = null;

		try {
			File file = new File(readFileName);
			fileRead = new Scanner(file, "windows-1251");
			fileWrite = new PrintStream(writeFileName, "windows-1251");
			List<String> linesList = new ArrayList<String>();
			while (fileRead.hasNextLine()) {
				linesList.add(fileRead.nextLine());
			}
			Collections.sort(linesList);
			// Descending order
			// Collections.reverse(linesList);
			for (String string : linesList) {
				fileWrite.println(string);
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File not found.");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("Unsupported encoding");
		} finally {
			if (fileRead != null) {
				fileRead.close();
			}
			if (fileWrite != null) {
				fileWrite.close();
			}
		}
	}
}
