package methods;

public class CheckIfNumBiggerItsNeighbours {
	
	public static int findFirstNumBiggerThenNeighbors(int[] arr){
		int result = -1;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
//	Find first element in the array which is bigger then it's neighbors		
		int[] arr = {1,2,3,6,4,4,2,3,5,7,8,9};
		int result = findFirstNumBiggerThenNeighbors(arr);

		System.out.println((result != -1) ? 
				(arr[result - 1] + " < "+ arr[result] + " > " + arr[result + 1]) : "There's no such number");
	}

}
