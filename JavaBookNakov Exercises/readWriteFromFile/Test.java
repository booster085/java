package readWriteFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * I will test reading and writing into .txt file.
 * Trying the examples from the JavaBook.
 * @author Ilian
 *
 */

public class Test {

	public static void main(String[] args) {
		
		//Relative path by default starts from JavaProject directory.
		String fileName = "src//readWriteFromFile//test.txt";
		Scanner fileReader = null;
		String searchedWord = "money";
		int occurences = 0;
		
		try {
		File file = new File(fileName);
		fileReader = new Scanner(file, "windows-1251");
		
		while(fileReader.hasNextLine()){
			String line = fileReader.nextLine();
			int index = line.indexOf(searchedWord);
			while (index != -1 ) {
				occurences++;
				index = line.indexOf(searchedWord, index + 1);
			}
		}
		} catch (FileNotFoundException fnf){
			System.out.println("File not found or wrong path!");
		} catch (NullPointerException npe) {
			System.out.println("File not found");
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.");
		}
		System.out.printf("Word %s occurs %d times in the text.\n", searchedWord, occurences);
		
		String fileNameWrite = "src//readWriteFromFile//test2.txt";
		PrintStream fileWriter = null;
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("The Hooponopono Method");
		strArr.add("I'm sorry!");
		strArr.add("Please forgive me!");
		strArr.add("Thank you!");
		strArr.add("I love you!");
		
		try {
		fileWriter = new PrintStream(fileNameWrite, "windows-1251");
		
		for (String string : strArr) {
			fileWriter.println(string);
		}
		} catch (FileNotFoundException fnf){
			System.out.println("File not found or wrong path!");
		} catch (NullPointerException npe){
			System.out.println("File not found");
		} catch (UnsupportedEncodingException uee){
			System.out.println("Unsupported encoding.");
		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
			System.out.println("PrintStream closed.");
		}
		
		
		

	}

}
