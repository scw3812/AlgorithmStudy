package quiz;

import java.util.Scanner;

public class SumRecur {
	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println(calAccSum(a, b));
	}
	
	public static int calAccSum(int start, int end) {
		if(start == end) return end;
		return start + calAccSum(start + 1, end);
	}
}
