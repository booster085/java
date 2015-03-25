package strings;

public class ReplaceForbiddenWordsInText {

	public static void main(String[] args) {
		
		String text = "Microsoft announced its next generation Java compiler today. "
				+ "It uses advanced parser and special optimizer for the Microsoft JVM.";
		String forbiidenWords = "Java, JVM, Microsoft";
		String[] forbWords = forbiidenWords.split("[^A-Za-z]+");

		StringBuilder stb = new StringBuilder(forbWords.length);
		
		for (int i = 0; i < forbWords.length; i++) {	
			for (int j = 0; j < forbWords[i].length(); j++) {
				stb.append("*");
			}
			text = text.replace(forbWords[i], stb);
		}
		System.out.println(text);
	}

}
