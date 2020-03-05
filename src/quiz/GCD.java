package quiz;

public class GCD {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 15;
		
		int small;
		int big;
		
		if(num1 > num2) {
			small = num2; 
			big = num1;
		}else {
			small = num1; 
			big = num2;
		}
		
		int gcd = 1;
		
		for(int i = 1; i <= small; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
		//최대공약수는 작은 수를 구한 후 작은 수까지 반복하면서 나눠서 공약수를 구한다
	}
}
