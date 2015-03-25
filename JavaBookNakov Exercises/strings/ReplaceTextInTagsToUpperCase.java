package strings;

import java.util.ArrayList;
import java.util.regex.*;

public class ReplaceTextInTagsToUpperCase {
	
	private static final Pattern REGEX = Pattern.compile("<upcase>(.*?)</upcase>");
	
	private static ArrayList<String> getValues(final String str) {
		final ArrayList<String> tagValues = new ArrayList<String>();
		final Matcher matcher = REGEX.matcher(str);
		while (matcher.find()) {
			tagValues.add(matcher.group(1));
		}
		return tagValues;
	}

	public static void main(String[] args) {

		String text = "We are living in a <upcase>yellow submarine</upcase>."
				+ "We don't have <upcase>anything</upcase> else.";

		String[] upperText = (((getValues(text).toString()).toUpperCase())
				.split(",")); // Convert text between tags to UpperCase.
		for (int i = 0; i < upperText.length; i++) {
			text = text.replaceFirst("<upcase>(.*?)</upcase>", upperText[i]); // Replace text and tags with UpperCase text.
		}
		text = text.replaceAll("\\[", "").replaceAll("\\]", ""); //Remove brackets
		System.out.println(text);
	}

}
