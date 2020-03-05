package quiz;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		int until;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for(int i = 1; i <= until; i++) {
			if(i == until) {
				System.out.println(i);
				break;
			}
			if(flag) {
				System.out.print(i + " + ");
				flag = !flag;
			}else {
				System.out.print(i + " - ");
				flag = !flag;
			}
		}
	}
}
