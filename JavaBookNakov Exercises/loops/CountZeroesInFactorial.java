package loops;

import java.lang.Number;
import java.math.BigInteger;

public class CountZeroesInFactorial {

	public static void main(String[] args) {
		
		int number = 125;
		BigInteger nFact = new BigInteger("1");
		int countZero = 0;
		//Divide to 5 -> find zeroes
		//At 5^2 and 5^3 add extra zero
		for (int i = 5; i <= number; i*=5) { 
			countZero += number / i;
		}
				
		for (BigInteger i = BigInteger.valueOf(number);
				i.compareTo(BigInteger.ZERO) > 0;
				i = i.subtract(BigInteger.ONE)) {
			nFact = nFact.multiply(i);
		}
		System.out.printf("N! -> %d! -> %d -> %d zeroes", number, nFact, countZero);
	}
}
