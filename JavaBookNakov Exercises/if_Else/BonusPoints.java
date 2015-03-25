package if_Else;

import java.util.Scanner;

public class BonusPoints {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter bonus: ");
		int bonus = input.nextInt();
		input.close();
		
		switch (bonus){
		case 1:
		case 2:
		case 3: System.out.println("Bonus points: " + bonus * 10);
			break;
		case 4:
		case 5:
		case 6: System.out.println("Bonus points: " + bonus * 100);
			break;
		case 7:
		case 8:
		case 9: System.out.println("Bonus points: " + bonus * 1000);
			break;
		default: System.out.println("Error occurred");
			break;
		}
	}

}
