package treesGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
/**
 * Sample class which traverses recursively given directory 
 * in Depth First Search algorithm manner
 * 
 * @author Ilian Grekov
 */

public class DirectoriesTraverseDFS {
	/**
	* Traverses and prints given directory recursively.
	* @param dir - the directory to be traversed.
	* @param spaces - the spaces used for representation
	* of the parent-child relation.
	*/
	private static String fileName; 
	private static PrintStream fileWrite = null;
	public static void traverseDir(File dir, String spaces){
		// If the current element is a directory,
		// we get all it sub directories and files
		if (dir.isDirectory()) {
			fileWrite.println(spaces + dir.getPath());
			String[] children = dir.list();
			for (String child : children) {
				traverseDir(new File(dir, child), spaces + "  ");
			}
		}
	}
	/**
	* Traverses and prints given directory recursively.
	* @param directoryPath - the path to the directory which
	* should be traversed.
	*/
	public static void traverseDir(String directoryPath) {
		traverseDir(new File(directoryPath), new String());
	}
	
	public static void main(String[] args) {
		fileName = "src//treesGraphs//DirectoriesDFS.txt";
		
		try {
			fileWrite = new PrintStream(fileName, "UTF-8");
			traverseDir("D:\\Games\\");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("Unsupported Encoding");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} finally {
			if (fileWrite != null) {
				fileWrite.close();
			}
		}
		
	}

}
