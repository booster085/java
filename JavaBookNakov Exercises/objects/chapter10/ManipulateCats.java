package objects.chapter10;

import java.util.Random;

public class ManipulateCats {
	
	private static String[] colorsArr = {"black&white", "grey", "brown", "white", "colorful","tiger"};
	public static Random rnd = new Random();
	
	public static String pickRandomColor(){
		String color = colorsArr[rnd.nextInt(colorsArr.length)];
		return color;
	}
	
	public static String generateCatName(){
		String catName = "Cat" + Sequence.nextValue();
		return catName;
	}

	public static void main(String[] args) {
		
		
		Cat[]catArr = new Cat[10];
		
		for (int i = 0; i < catArr.length; i++) {
			catArr[i] = new Cat(generateCatName(), pickRandomColor());
			catArr[i].sayMrrr();
		}
		

	}

}
