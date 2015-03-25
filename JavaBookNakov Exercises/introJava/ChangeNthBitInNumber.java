package introJava;

public class ChangeNthBitInNumber {

	public static void main(String[] args) {
		/*Дадено е число n, стойност v (v = 0 или 1) и позиция p. Напишете поредица от операции, 
		които да променят стойността на n, така че битът на позиция p да има стойност v. 
		Пример n=35, p=5, v=0 -> n=3. Още един пример: n=35, p=2, v=1 -> n=39*/
		int number = 75;
		int bitPosition = 4;
		int i = 1;
		int mask = i << bitPosition;
		int result = number ^ mask; //0^0 and 1^1 = 0; 1^0 and 0^1 = 1;
		System.out.println("Result is: " + result);
	}

}
