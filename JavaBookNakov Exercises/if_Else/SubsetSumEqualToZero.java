package if_Else;

public class SubsetSumEqualToZero {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		int num3 = -4;
		
		if ((num1 + num2) == 0) {
			System.out.printf("Sum of %d and %d is 0", num1, num2);
		} else if ((num1 + num3) == 0) {
			System.out.printf("Sum of %d and %d is 0", num1, num3);
		} else if ((num2 + num3) == 0) {
			System.out.printf("Sum of %d and %d is 0", num2, num3);
		} else {
			System.out.println("There is no subset sum equal to 0");
		}
	}

}
