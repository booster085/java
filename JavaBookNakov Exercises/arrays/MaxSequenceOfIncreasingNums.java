package arrays;

public class MaxSequenceOfIncreasingNums {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1, 9, 11, 1, 4};
		int maxSeq = 1;
		int counter = 1;
		int bestStart = 0;
		int tempStart = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i - 1] < arr[i]) {
				counter++;
			}else{
			tempStart = i;	
			counter = 1;
			}
			if (maxSeq <= counter) {
				maxSeq = counter;
				bestStart = tempStart;
			}
		}
		int bestEnd = bestStart + maxSeq;
		
		for (int j = bestStart; j < bestEnd; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
