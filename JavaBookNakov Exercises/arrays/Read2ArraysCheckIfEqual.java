package arrays;

import java.util.Scanner;

public class Read2ArraysCheckIfEqual {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first array length: ");
		int arr1Length = input.nextInt(); //set first array length
		System.out.print("Enter second array length: ");
		int arr2Length = input.nextInt(); ////set second array length
		boolean equal = true;
		//if lengths not equal -> arrays not equal
		if (arr1Length == arr2Length){ 
			int[] arr1 = new int[arr1Length]; 
			int[] arr2 = new int[arr2Length];
			System.out.println("Enter first array values:");
			
			for (int i = 0; i < arr1.length; i++) { //read first array
				arr1[i] = input.nextInt();
			}
			
			System.out.println("Enter second array values:");
			
			for (int j = 0; j < arr2.length; j++) { //read second array
				arr2[j] = input.nextInt();
			}
			
			for (int k = 0; k < arr1.length; k++) {
				if(arr1[k] != arr2[k]){
					equal = false;
					break;
				}
			}
		}else {
			equal = false;
		}
		input.close();
		System.out.println("Equal: " + equal);
	}

}
