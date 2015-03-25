package recursion;

public class test {
	
	private static char[][] lab = {
		{' ', ' ', ' ', '*', ' ', ' ', ' '},
		{'*', '*', ' ', '*', ' ', '*', ' '},
		{' ', ' ', ' ', ' ', ' ', ' ', ' '},
		{' ', '*', '*', ' ', '*', '*', '*'},
		{' ', ' ', '*', ' ', ' ', ' ', 'e'},
	};
	private static char path[] = new char[lab.length * lab[0].length];
	private static int counter = 0;
	private static boolean isTherePath = false;
	private static void findPath(int row, int col, char direction){
		if ((row < 0) || (col < 0) || 
				(row >= lab.length) || (col >= lab[0].length)) {
			return;
		}
		
		path[counter] = direction;
		counter++;
		
		if (lab[row][col] == 'e') {
			printPath(path, 1, counter - 1);
			isTherePath = true;
			
		}
		
		if (lab[row][col] == ' ' ) {
			//Mark cell as visited
			lab[row][col] = 's';
			
			//Invoke recursion in 4 directions
			findPath(row, col+1, 'R');	//right
			findPath(row+1, col, 'D');	//down
			findPath(row, col-1, 'L');	//left
			findPath(row-1, col, 'U');	//up
			
			//Mark back cell as free
			lab[row][col] = ' ';
		}
		// Remove the direction from the path
		counter--;
		
	}
	public static void printPath(char[] path, int start, int end){
		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		//Find path in labyrinth
		findPath(0, 0, 'S');
		if (!isTherePath) {
			System.out.println("Sorry, no exit!");
		}
	}
	
}
