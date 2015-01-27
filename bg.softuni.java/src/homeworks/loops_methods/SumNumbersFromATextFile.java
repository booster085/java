package Homeworks.loops_methods;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SumNumbersFromATextFile {
	
	private static final String FILEPATH = "text_files/InputNUmbers.txt"; 

	public static void main(String[] args) {
		
		File file = new File(FILEPATH);
		Scanner fileReader = null;
		int sum = 0;
		try {
			fileReader = new Scanner(file, "windows-1251");
			while(fileReader.hasNextLine()) {
				sum += fileReader.nextDouble();
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}
	}

}
