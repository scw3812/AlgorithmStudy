package quiz;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 13;
		boolean isPrimeNum = true;
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
				isPrimeNum = false;
				return;
			}
		}
		if(isPrimeNum) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}
	}
}
