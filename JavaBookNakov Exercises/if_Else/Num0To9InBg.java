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
		case 0: number = "����"; break;
		case 1: number = "����"; break;
		case 2: number = "���"; break;
		case 3: number = "���"; break;
		case 4: number = "������"; break;
		case 5: number = "���"; break;
		case 6: number = "����"; break;
		case 7: number = "�����"; break;
		case 8: number = "����"; break;
		case 9: number = "�����"; break;

		default:
			break;
		}
		System.out.printf("%d in bulgarian is: \"%s\".",num, number);
	}

}
