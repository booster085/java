package readWriteFromFile;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Напишете програма, която прочита списък от думи от файл, наречен words.txt,
 * преброява колко пъти всяка от тези думи се среща в друг файл text.txt и
 * записва резултата в трети файл – result.txt, като преди това ги сортира по
 * брой на срещане в намаляващ ред
 * 
 * @author Azbe
 *
 */

public class WordsCounterSortWrite {
	/*
	 * create file words.txt read words from file split line to separate words
	 * create file text.txt count every wordArr[i] occurrence in text.txt save
	 * occurrence to Hashmap sort Hashmap through LinkedList, LinkedHashmap
	 * Collection.sort, Comparator create output file result.txt
	 */
	public static void main(String[] args) {
		File fileWords = new File("src//readWriteFromFile//words.txt");
		File fileText = new File("src//readWriteFromFile//text.txt");
		Scanner fileRead = null;
		Scanner fileRead2 = null;
		PrintStream fileWrite = null;
		try {
			fileRead = new Scanner(fileWords, "windows-1251");
			String[] wordArr = fileRead.nextLine().split("\\s+");
			fileRead2 = new Scanner(fileText, "windows-1251");
			HashMap<String, Integer> wordOccurrence = new HashMap<String, Integer>();
			for (String word : wordArr) {
				int occurrence = 0;
				/*
				 * The problem here is was that after first reading the file,
				 * Scanner hasNextLine => false and don't enter in the while for
				 * next word. So I close the scanner after every read iteration
				 * of the file and reopen again.
				 */
				while (fileRead2.hasNextLine()) {
					String line = fileRead2.nextLine();
					int result = 0;
					while (result != -1) {
						result = line.indexOf(word, result + 1);
						if (result != -1) {
							occurrence++;
						}
					}
				}
				if (fileRead2 != null) {
					fileRead2.close();
					fileRead2 = new Scanner(fileText, "windows-1251");
				}
				wordOccurrence.put(word, occurrence);
			}
			wordOccurrence = sortByComparator(wordOccurrence);

			fileWrite = new PrintStream("src//readWriteFromFile//result.txt",
					"windows-1251");
			for (Entry<String, Integer> pair : wordOccurrence.entrySet()) {
				fileWrite.println(pair.getKey() + " --> " + pair.getValue());
				System.out.println((pair.getKey() + " --> " + pair.getValue()));
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File not found");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("Unsupported encoding");
		} finally {
			if (fileRead != null) {
				fileRead.close();
			}
			if (fileRead2 != null) {
				fileRead2.close();
			}
			if (fileWrite != null) {
				fileWrite.close();
			}
		}
	}

	private static HashMap<String, Integer> sortByComparator(
			HashMap<String, Integer> unsortMap) {

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(
				unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> entry1,
					Entry<String, Integer> entry2) {

				return entry2.getValue().compareTo(entry1.getValue());

			}
		});

		// Maintaining insertion order with the help of LinkedList
		HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
