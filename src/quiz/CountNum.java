package quiz;

public class CountNum {
	public static void main(String[] args) {
		int n = 421314218;
		int[] digit = new int[10];
		
		while(n > 0) {
			digit[n % 10]++;
			n /= 10;
		}
		
		for(int i = 0; i < digit.length; i++) {
			System.out.println(i + ": " + digit[i]);
		}
	}
}
