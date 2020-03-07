package quiz;

import java.util.Scanner;

public class ChickenCoupon {
	public static void main(String[] args) {
		int n;
		int k;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		
		doFunc(n, 0, k, 0);
	}
	
	public static void doFunc(int n, int stamp, int k, int ans) {
		if(n > 0) {
			n--;
			stamp++;
			ans++;
			doFunc(n, stamp, k, ans);
			return;
		}else if(stamp > 0) {
			if(stamp/k > 0) {
				stamp -= k;
				n++;
				doFunc(n, stamp, k, ans);
			}			
		}
		if(n == 0 && stamp/k == 0) {
			System.out.println(ans);
		}
		
	}
	
}
