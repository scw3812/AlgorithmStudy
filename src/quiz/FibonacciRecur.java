package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FibonacciRecur {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(pibonacci(n)+"");
		bw.flush();
		bw.close();	
	}
	
	public static int pibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return pibonacci(n - 1) + pibonacci(n - 2);
	}
}
