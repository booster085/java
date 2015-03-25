package arrays;

public class MostCommonNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 1, 3};
		int maxCount = 1;
		int tempCount = 1;
		int maxCountNumber = arr[0];
		
		for (int i = 0; i < arr.length - 1; i++) {
			tempCount = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]){
					tempCount++;
				}
			}
			if (tempCount > maxCount) {
				maxCount = tempCount;
				maxCountNumber = arr[i];
			}	
		}
		System.out.printf("Most common number is: %d -> (%d times)", maxCountNumber, maxCount);
	}

}
