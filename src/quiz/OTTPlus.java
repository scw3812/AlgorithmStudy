package quiz;

import java.util.Scanner;

public class OTTPlus {
	//Á¡È­½Ä [n] = [n-1] + [n-2] + [n-3]
	
	static int[] cache = new int[1000];
	
	public static void main(String[] args) {
		int n;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(doFunc(n));
	}
	
	public static int doFunc(int n) {
		if(cache[n] != 0) {
			return cache[n];
		}
		
		return cache[n] = doFunc(n - 1) + doFunc(n - 2) + doFunc(n - 3);
	}
}
