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
		//�ִ������� ���� ���� ���� �� ���� ������ �ݺ��ϸ鼭 ������ ������� ���Ѵ�
	}
}
