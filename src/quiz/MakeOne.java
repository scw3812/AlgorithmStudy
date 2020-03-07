package quiz;

import java.util.Scanner;

public class MakeOne {
	
	static int[] ans = new int[1000001];
	
	public static void main(String[] args) {
		ans[2] = 1;
		ans[3] = 1;
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i = 4; i <= 1000000; i++) {
			int a = 99999, b = 99999, c =99999;
			for(int w = 1; w <= 3; w++) {
				if(w == 1) {
					a = ans[i - 1];
				}else if(w == 2) {
					if(i % 2 == 0) {
						b = ans[i / 2];
					}					
				}else if(w == 3) {
					if(i % 3 == 0) {
						c = ans[i / 3];
					}				
				}
			}
			int min = min(a, b, c);
			ans[i] = min + 1;
		}
		System.out.println(ans[input]);
		System.out.println(makeOne(input));
	}
	
	public static int min(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		return min;
	}
	
	public static int makeOne(int n) {
		int count = 0;
		if(n == 2) {
			count = 1;
		}else if(n == 3) {
			count = 1;
		}else {
			int a = 1000001; int b = 1000001, c = 1000001;
			for(int w = 1; w <= 3; w++) {				
				if(w == 1) {
					a = makeOne(n - 1) + 1;
				}else if(w == 2) {
					if(n % 2 == 0) {
						b = makeOne(n / 2) + 1;
					}
				}else if(w == 3) {
					if(n % 3 == 0) {
						c = makeOne(n / 3) + 1;
					}
				}
			}
			count = min(a, b, c);
		}	
		return count;
	}
}
