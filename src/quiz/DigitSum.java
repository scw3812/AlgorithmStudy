package quiz;

public class DigitSum {
	public static void main(String[] args) {
		int input = 1232;
		int sum = 0;
		while(input != 0) {
			sum += input % 10;
			input /= 10;
		}
		System.out.println(sum);
	}
}
