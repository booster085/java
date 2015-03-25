package treesGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Sample class which traverses recursively given directory 
 * in Breath First Search algorithm manner
 * 
 * @author Ilian Grekov
 */

public class DirectoryTraverseBFS {
	/**
	* Traverses and prints given directory with BFS.
	* @param startDir - the path to the directory which
	* should be traversed.
	*/
	private static String fileName; 
	private static PrintStream fileWrite = null;
	public static void traverseDir(String startDirectory){
		Queue<File> visitedDirsQueue = new LinkedList<File>();
		visitedDirsQueue.add(new File(startDirectory));
		while(visitedDirsQueue.size() > 0) {
			File currentDir = visitedDirsQueue.remove();
			fileWrite.println(currentDir.getAbsolutePath());
			File[] children = currentDir.listFiles();
			if(children != null) {
				for (File child : children) {
					if (child.isDirectory()) {
					visitedDirsQueue.add(child);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		fileName = "src//treesGraphs//DirectoriesBFS.txt";
		
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
