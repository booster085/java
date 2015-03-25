package arrays;

public class PrintMatrixVariants {
	
	public static int[][] createMatrixD(int n){
		int[][] matrix = new int[n][n];
		int row = 0;
		int col = 0;
		char direction = 'd';
		int cicles = n * n;
		
		for (int i = 1; i <= cicles; i++) {
			
			if(direction == 'd' && (row > n - 1 || matrix[row][col] != 0)){
				direction = 'r';
				col++;
				row--;
			}else if (direction == 'r' && (col > n - 1 || matrix[row][col] != 0)) {
				direction = 'u';
				row--;
				col--;
			}else if (direction == 'u' && (row < 0 || matrix[row][col] != 0)) {
				direction = 'l';
				col--;
				row++;
			}else if (direction == 'l' && (col < 0 || matrix[row][col] != 0)){
				direction = 'd';
				row++;
				col++;
			}
			
			matrix[row][col] = i;
			
			if(direction == 'd'){
				row++;
			}else if (direction == 'r') {
				col++;
			}else if (direction == 'u') {
				row--;
			}else if (direction == 'l'){
				col--;
			}
		}
		
		return matrix;
	}
	
	public static int[][] createMatrixC(int n){
		int[][] matrix = new int[n][n];
		int counter = 1;
		int row = 0;
		int col = 0;
		
		for (int i = matrix.length - 1; i >= 0; i--) {
			row = i;
			col = 0;
			while(row < matrix.length && col < matrix[row].length){
				matrix[col++][row++] = counter++;
			}
		}
		for (int j = 1; j < matrix.length; j++) {
			row = 0;
			col = j;
			while(row < matrix.length && col < matrix[row].length){
				matrix[col++][row++] = counter++;
			}
		}
				//System.out.println();
		
		return matrix;
	}
	
	public static int[][] createMatrixB(int n){
		int[][] matrix = new int[n][n];
		int counter = 1;
		
		for (int col = 0; col < matrix.length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < matrix[col].length; row++) {
					matrix[col][row] = counter++;
				}
			}else {
				for (int row = matrix[col].length - 1; row >= 0; row--) {
					matrix[col][row] = counter++;
				}
			}
		}
		return matrix;
	}
	
	public static int[][] createMatrixA(int n){
		int[][] matrix = new int[n][n];
		int counter = 1;
		
		for (int col = 0; col < matrix.length; col++) {
			for (int row = 0; row < matrix[col].length; row++) {
				matrix[col][row] = counter++;
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.printf("%-3d",matrix[col][row]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		//Matrix Size from the console
		int size = 4;
		int[][] matrix = new int[size][size];
		matrix = createMatrixA(size);
		printMatrix(matrix);
		System.out.println("************");
		
		matrix = createMatrixB(size);
		printMatrix(matrix);
		System.out.println("************");
		
		matrix = createMatrixC(size);
		printMatrix(matrix);
		System.out.println("************");
		
		matrix = createMatrixD(size);
		printMatrix(matrix);
	}

}
