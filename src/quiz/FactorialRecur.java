package quiz;

import java.util.Scanner;

public class FactorialRecur {
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		System.out.println(factorial(input));
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(n - 1);
	}
}
