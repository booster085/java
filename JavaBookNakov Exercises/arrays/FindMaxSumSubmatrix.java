package arrays;

public class FindMaxSumSubmatrix {

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 1, 2, 3, 4, 6 }, 
				{ 3, 6, 6, 7, 4 },
				{ 6, 2, 9, 7, 8 }, 
				{ 4, 6, 5, 3, 6 } };

		int tempSum = 0;
		int maxSum = 0;
		int bestRow = 0;
		int bestCol = 0;
// 		submatrix 2x2
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				tempSum = (matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]);
				if (tempSum > maxSum) {
					maxSum = tempSum;
					bestRow = i;
					bestCol = j;
				}
			}
		}
		System.out.println("The best sum in submatrix 2x2 is: " + maxSum);
		System.out.printf("%d %d\n%d %d", matrix[bestRow][bestCol],
				matrix[bestRow][bestCol + 1], matrix[bestRow + 1][bestCol],
				matrix[bestRow + 1][bestCol + 1]);
		
		
		System.out.println();
	}

}
