package loops;

import java.util.Scanner;

public class NumsNotDividedBy3And7 {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int counter = 0;
		while (counter < n){
			counter++;
			if((counter % 3 == 0) || (counter % 7 == 0) ){
				continue;
			}
			System.out.print(counter + ", ");
		}
	}

}
