package classes;

import java.util.Scanner;

public class Test {

	private int age;
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public Test(){
		this(1);
	}
	public Test(int age){
		this.age = age;
	}
	public void speak(){
		System.out.println("Test can not speak");
	}
	public static void reverse(String text){
		String[] arr = text.split("[\\s]");
		for (int j = 0; j < arr.length; j++) {
			for (int i = arr[j].length() - 1; i >= 0; i--) {
				System.out.print(arr[j].charAt(i));
			}
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter text to reverse");
		reverse(inp.nextLine());
		System.out.println();
		Test teste = new Test(6);
		teste.speak();
		inp.close();
	
	}
}
