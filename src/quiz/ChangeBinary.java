package quiz;

public class ChangeBinary {
	public static void main(String[] args) {
		int inputNum = 19;
		int[] bin = new int[100];
		//10������ 2�� ��� ���� �� �������� �Ųٷ� ���� 2����
		int i = 0;
		while(inputNum != 0) {
			bin[i++] = inputNum % 2;
			inputNum = inputNum / 2;
		}
		for(int j = i - 1; j >= 0; j--) {
			System.out.print(bin[j]);
		}
	}
}
