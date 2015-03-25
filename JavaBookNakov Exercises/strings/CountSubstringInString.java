package strings;

public class CountSubstringInString {

	public static void main(String[] args) {
		
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very in tight. So we are drinking all the day. "
				+ "We will move out of it in 5 days.";
		String subStr = "in";
		int result = 0;
		int counter = 0;
		while(result != -1){
			result = text.indexOf(subStr, result + 1);
			counter++;
		}
		System.out.printf("\"%s\" is met %d times in the text", subStr, counter);
	}

}
