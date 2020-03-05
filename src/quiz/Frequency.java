package quiz;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		
		for(int i = 0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		
		for(int i = 0; i < 10; i++) {
			mode[inputNum[i]]++;
		}
		int max = mode[0];
		int frequentNum = 0;
		for(int i = 0; i < 10; i++) {
			if(mode[i] > max) {
				max = mode[i];
				frequentNum = i;
			}
		}
		System.out.println("ÃÖºó¼ö: " + frequentNum);
	}
}
