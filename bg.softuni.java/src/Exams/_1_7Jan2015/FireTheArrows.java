package Exams._1_7Jan2015;

import java.util.Scanner;

public class FireTheArrows {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();
		char[][] arrowMatrix = new char[n][];
		for (int i = 0; i < n; i++) {
			arrowMatrix[i] = input.nextLine().toCharArray();
		}

		boolean isArrowMoving;
		
		do {
			isArrowMoving = false;
			for (int row = 0; row < arrowMatrix.length; row++) {
				for (int col = 0; col < arrowMatrix[row].length; col++) {
					char symbol = arrowMatrix[row][col];
					switch (symbol) {
					case '<':
						if (col - 1 >= 0 && arrowMatrix[row][col - 1] == 'o') {
							arrowMatrix[row][col - 1] = symbol;
							arrowMatrix[row][col] = 'o';
							isArrowMoving = true;
						}
						break;
					case '^':
						if (row - 1 >= 0 && arrowMatrix[row - 1][col] == 'o') {
							arrowMatrix[row - 1][col] = symbol;
							arrowMatrix[row][col] = 'o';
							isArrowMoving = true;
						}
						break;
					case 'v':
						if (row + 1 < arrowMatrix.length
								&& arrowMatrix[row + 1][col] == 'o') {
							arrowMatrix[row + 1][col] = symbol;
							arrowMatrix[row][col] = 'o';
							isArrowMoving = true;
						}
						break;
					case '>':
						if (col + 1 < arrowMatrix[row].length
								&& arrowMatrix[row][col + 1] == 'o') {
							arrowMatrix[row][col + 1] = symbol;
							arrowMatrix[row][col] = 'o';
							isArrowMoving = true;
						}
						break;

					default:
						break;
					}
				}
			}
		} while (isArrowMoving);
		for (char[] charRow : arrowMatrix) {
			for (char symbol : charRow) {
				System.out.print(symbol);
			}
			System.out.println();
			
		}
	}

}
