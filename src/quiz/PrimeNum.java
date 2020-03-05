package quiz;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 13;
		boolean isPrimeNum = true;
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.println(num + "은 소수가 아닙니다");
				isPrimeNum = false;
				return;
			}
		}
		if(isPrimeNum) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다");
		}
	}
}
