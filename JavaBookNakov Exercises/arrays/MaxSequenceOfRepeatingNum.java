package arrays;

public class MaxSequenceOfRepeatingNum {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 1};	
		int bestLength = 1;
		int tempLength = 1;
		int bestStart = 0;
		int tempStart = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i - 1] == arr[i]){
				tempLength++;
			}else {
				tempLength = 1;
				tempStart = i;
			}
			if(bestLength <= tempLength){ 
												//"<=" Get last max sequence, if only "<" get first max sequence  
				bestLength = tempLength;
				bestStart = tempStart;
			}
		}
		int bestEnd = bestStart + bestLength;
		
		for (int j = bestStart; j < bestEnd; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
