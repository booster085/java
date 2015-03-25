package introJava;

public class DivideBy5And7NoReminder {

	public static void main(String[] args) {
		
		boolean divide = false;
		int num = 33;
		if ((num % 5 == 0) && (num % 7 == 0)){
			divide = true;
		}
		System.out.println(divide);
	}

}
