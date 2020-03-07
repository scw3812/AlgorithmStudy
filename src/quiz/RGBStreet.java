package quiz;

import java.util.Scanner;

public class RGBStreet {
	static int[][] ans = new int[1002][4];
	static int[][] rgb = new int[1002][4];
	static int R = 1;
	static int G = 2;
	static int B = 3;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j = R; j <= B; j++) {
				rgb[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 1; i <= input; i++) {
			for(int j = R; j <= B; j++) {
				ans[i][j] = 999999999;
			}
		}
		
		ans[1][R] = rgb[1][R];
		ans[1][G] = rgb[1][G];
		ans[1][B] = rgb[1][B];
		for(int i = 2; i <= input; i++) {
			for(int j = R; j <= B; j++) {
				for(int k = R; k <= B; k++) {
					if(j != k) {
						ans[i][j] = min(ans[i][j], ans[i - 1][k] + rgb[i][j], 999999999);
					}
				}
			}
		}
		System.out.println(min(ans[input][R], ans[input][G], ans[input][B]));
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
}
