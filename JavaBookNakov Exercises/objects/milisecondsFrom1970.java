package objects;

public class milisecondsFrom1970 {

	public static void main(String[] args) {
		
		long timePeriod = System.currentTimeMillis();
		long seconds = timePeriod/1000;
	
		long days = seconds/(24*60*60);
		long hours = seconds/(60*60) - days*24;
		long minutes = (seconds/60) - (hours*60) - (days*24*60);
		System.out.printf("From 1.01.1970 till now have passed\n"
				+ "%d days %d hours and %d minutes", days, hours, minutes);
	}

}
