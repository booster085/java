package exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
/**
 * Прочетете файла ред по ред с класа java.util.Scanner и добавяйте редовете в StringBuilder. 
 * Декларирайте в сигнатурата на метода, 
 * че изхвърля IOException и не обработвайте никакви изключения в него.
 * @param args
 * @throws IOException 
 */
	public static String readFile(String fileName) throws IOException{
		
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		Scanner input = new Scanner(fis);
		StringBuilder strBuild = new StringBuilder();
		String nl = System.getProperty("line.separator");
		
		try {
			while (input.hasNextLine()){
				strBuild.append(input.nextLine() + nl);
			}
		} finally {
			input.close();
		}
		return strBuild.toString();
	}
	
	public static void main(String[] args) throws IOException {
		
		
		String fileText = readFile("C:\\Users\\Azbe\\Desktop\\zapisVideo.txt");
		System.out.println(fileText);
		
	}
	
}
