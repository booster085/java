package exceptions;

public class test {
	
	public static void main(String[] args) {
		
		SecurityException secEx = new SecurityException("Danger");
		throw secEx;
	}

}
