package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeBinaryRecur {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		changeBinary(n);
	}
	
	public static void changeBinary(int n) {
		if(n == 0) return;
		changeBinary(n / 2);
		System.out.print(n % 2);
	}
}
