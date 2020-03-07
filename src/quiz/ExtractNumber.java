package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExtractNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		extract(input);
	}
	
	public static void extract(int n) throws IOException {
		if(n == 0) return;
		extract(n/10);
		System.out.println(n % 10);
	}
}
