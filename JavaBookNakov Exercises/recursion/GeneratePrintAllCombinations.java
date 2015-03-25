package recursion;

import java.util.Scanner;

public class GeneratePrintAllCombinations {
	
	public static int numberOfLoops;
	public static int numberOfIterations;
	
	public static int[] loops;

	public static void createNestedLoops(int currentLoop, int start){
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		for (int counter = start; counter <= numberOfIterations; counter++) {
			loops[currentLoop] = counter;
			createNestedLoops(currentLoop + 1, counter);
		}
	}
	public static void printLoops(){
		for (int i = 0; i < loops.length; i++) {
			System.out.printf("%d ", loops[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("N = ");
		numberOfLoops = input.nextInt();
		
		System.out.println("K = ");
		numberOfIterations = input.nextInt();
		loops = new int[numberOfLoops];
		
		createNestedLoops(0, 1);
		input.close();
	}

}
