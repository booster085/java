package Homeworks.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbersArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>(); 
		for (int i = 0; i < n; i++) {
			numbersList.add(input.nextInt());
		}
		Collections.sort(numbersList);
		for (Integer integer : numbersList) {
			System.out.print(integer+" ");
		}
		
		
		
		

	}

}
