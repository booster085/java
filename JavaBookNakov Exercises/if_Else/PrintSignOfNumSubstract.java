package if_Else;

public class PrintSignOfNumSubstract {

	public static void main(String[] args) {
		
		int a = 243;
		int b = 45;
		char sign = '+';
		
		if (a - b < 0) {
			sign = '-';
		}
		System.out.println(sign);

	}

}
