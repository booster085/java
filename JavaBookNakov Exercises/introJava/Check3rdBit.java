package introJava;

public class Check3rdBit {

	public static void main(String[] args) {
		//I take the presumption bits count starts from 0
		int number = 36;
		int result = number & Integer.parseInt("1000", 2);
		System.out.println(result == 0 ? '0' : '1');
	}

}
