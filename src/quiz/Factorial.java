package quiz;

public class Factorial {
	public static void main(String[] args) {
		int input = 5;
		int fac = 1;
		for(int i = 1; i <= input; i++) {
			fac *= i;
		}
		System.out.println(fac);
		
		fac = 1;
		for(int i = input; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(fac);
	}
}
