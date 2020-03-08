package quiz;

import java.util.Scanner;

public class BTN {
	public static void main(String[] args) {
		int cnt;
		int input[] = new int[1001];
		Scanner scan = new Scanner(System.in);
		
		cnt = scan.nextInt();
		for(int i = 1; i <= cnt; i++) {
			input[i] = scan.nextInt();
		}
		
		int dpH[] = new int[1001];
		int dpL[] = new int[1001];
		
		for(int i = 1; i <= cnt; i++) {
			dpH[i] = 1;
			dpL[i] = 1;
		}
		
		for(int i = 2; i <= cnt; i++) {
			for(int j = i; j >= 0; j--) {
				if(input[i] > input[j]) {
					dpH[i] = getMax(dpH[i], dpH[j] + 1);
				}
			}
		}
		
		for(int i = cnt - 1; i >= 1; i--) {
			for(int j = i; j <= cnt; j++) {
				if(input[i] > input[j]) {
					dpL[i] = getMax(dpL[i], dpL[j] + 1);
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i <= cnt; i++) {
			if(max < dpH[i] + dpL[i] - 1) {
				max = dpH[i] + dpL[i] - 1;
			}
		}
		
		System.out.println(max);
	}
	
	public static int getMax(int a, int b) {
		if(a > b) return a;
		return b; 
	}
}
