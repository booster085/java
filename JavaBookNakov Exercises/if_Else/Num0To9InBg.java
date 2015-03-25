package if_Else;

import java.util.Scanner;

public class Num0To9InBg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 0-9: ");
		int num = input.nextInt();
		String number = "";
		input.close();
		
		switch (num) {
		case 0: number = "Нула"; break;
		case 1: number = "Едно"; break;
		case 2: number = "Две"; break;
		case 3: number = "Три"; break;
		case 4: number = "Четири"; break;
		case 5: number = "Пет"; break;
		case 6: number = "Шест"; break;
		case 7: number = "Седем"; break;
		case 8: number = "Осем"; break;
		case 9: number = "Девет"; break;

		default:
			break;
		}
		System.out.printf("%d in bulgarian is: \"%s\".",num, number);
	}

}
