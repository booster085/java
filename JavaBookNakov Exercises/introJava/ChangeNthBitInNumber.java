package introJava;

public class ChangeNthBitInNumber {

	public static void main(String[] args) {
		/*������ � ����� n, �������� v (v = 0 ��� 1) � ������� p. �������� �������� �� ��������, 
		����� �� �������� ���������� �� n, ���� �� ����� �� ������� p �� ��� �������� v. 
		������ n=35, p=5, v=0 -> n=3. ��� ���� ������: n=35, p=2, v=1 -> n=39*/
		int number = 75;
		int bitPosition = 4;
		int i = 1;
		int mask = i << bitPosition;
		int result = number ^ mask; //0^0 and 1^1 = 0; 1^0 and 0^1 = 1;
		System.out.println("Result is: " + result);
	}

}
