package introJava;

import java.util.Scanner;

public class HumanWeightOnMoon {

	public static void main(String[] args) {
		// 17%
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight:");
		float earthWeight = input.nextFloat();
		float moonWeight = earthWeight * 17 / 100;
		System.out.printf("Weight on Moon: %skg", moonWeight);
	}

}
