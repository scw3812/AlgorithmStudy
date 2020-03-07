package quiz;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		int coin[] = new int[101];
		int dp[] = new int[10001];
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			coin[i] = scan.nextInt();
		}
		dp[0] = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = coin[i]; j <= k; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		
		System.out.println(dp[k]);
	}
}
