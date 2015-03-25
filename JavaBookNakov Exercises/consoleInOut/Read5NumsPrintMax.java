package consoleInOut;

public class Read5NumsPrintMax {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		int c = 8;
		int d = 2;
		int e = 60;
		int[] arr = {a,b,c,d,e};
		int maxNum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] < arr[i]){
				maxNum = arr[i];
			}
		}
		System.out.println("Max number is: " + maxNum);
	}

}
