package objects.chapter10;

public class Sequence {

	private static int currentValue = 0;

	private Sequence() {
	}

	public static int nextValue() {
		currentValue++;
		return currentValue;
	}
}
