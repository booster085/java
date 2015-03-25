package arrays;

public class SieveOfErathosten {

	public static void runEratosthenesSieve(int upperBound) {
	      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
	      boolean[] isComposite = new boolean[upperBound + 1];
	      for (int m = 2; m <= upperBoundSquareRoot; m++) {
	            if (!isComposite[m]) {
	                  System.out.print(m + " ");
	                  for (int k = m * m; k <= upperBound; k += m){
	                	  isComposite[k] = true;  
	                  }
	            }
	      }
	      for (int m = upperBoundSquareRoot; m <= upperBound; m++)
	            if (!isComposite[m])
	                  System.out.print(m + " ");
	}
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		runEratosthenesSieve(100);
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		long runTime = endTime - startTime;
		System.out.println("Total run time: " + runTime);
	}

}
