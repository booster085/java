package consoleInOut;

import java.util.Scanner;

public class CompanyInfoReadPrint {

	public static void main(String[] args) {
		//име, адрес, телефонен номер, факс номер, уеб сайт и мениджър. 
		Scanner input = new Scanner(System.in);
		System.out.print("Company name: ");
		String cName = input.nextLine();
		System.out.print("Phone number: ");
		String cPhone = input.nextLine();
		System.out.print("Fax number: ");
		String cFax = input.nextLine();
		System.out.print("Website: ");
		String cWeb = input.nextLine();
		input.close();
		
		System.out.printf("Company name: %s%n", cName);
		System.out.printf("Company phone: %s%n", cPhone);
		System.out.printf("Company fax: %s%n", cFax);
		System.out.printf("Company website : %s%n", cWeb);
	}

}
