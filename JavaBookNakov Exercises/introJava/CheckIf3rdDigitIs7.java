package introJava;

public class CheckIf3rdDigitIs7 {

	public static void main(String[] args) {
		
		int num = 374683;
		System.out.println("Is 3rd digit right to left in " + num + " = 7?");
		boolean result = false;
		if ((num / 100) % 10 == 7){
			result = true;
		}
		System.out.println(result);
	}

}
