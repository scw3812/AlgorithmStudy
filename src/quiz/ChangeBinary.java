package quiz;

public class ChangeBinary {
	public static void main(String[] args) {
		int inputNum = 19;
		int[] bin = new int[100];
		//10진수를 2로 계속 나눈 후 나머지를 거꾸로 쓴게 2진수
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
