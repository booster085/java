package recursion;

import java.util.Scanner;

public class K_NestedLoopsToN {
/**
 * Print all variations	
 */
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[]loops;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("N = "); //How many positions //3 -> 1 1 1
		numberOfLoops = input.nextInt();
		System.out.print("K = "); //Number to count to //8 -> 1 1 8
		numberOfIterations = input.nextInt();
		loops = new int[numberOfLoops];
		input.close();
		createNestedLoops(0);
	}
	
	public static void createNestedLoops(int currentLoop){
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		for (int counter = 1; counter <= numberOfIterations; counter++) {
			loops[currentLoop] = counter;
			createNestedLoops(currentLoop + 1);
		}
	}
	
	public static void printLoops(){
		for (int i = 0; i < loops.length; i++) {
			System.out.print(loops[i] + " ");
		}
		System.out.println();
	}

}
