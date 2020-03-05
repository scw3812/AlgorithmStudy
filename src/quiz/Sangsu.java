package quiz;

public class Sangsu {
	public static void main(String[] args) {
		int a = 734;
		int b = 893;
		Sangsu s = new Sangsu();
		a = s.reverseNum(a);
		b = s.reverseNum(b);
		
		if(a > b) {
			System.out.println(s.reverseNum(a));
		}else {
			System.out.println(s.reverseNum(b));
		}
	}
	
	public int reverseNum(int a){
		int arrA[] = new int[3];
		
		int lenA = 0;
		do {
			arrA[lenA] = a % 10;
			a /= 10;
			lenA++;
		} while(a > 0);
		
		int tranA = 0;
		int mux = 1;
		for(int i = arrA.length - 1; i >= 0; i--) {
			tranA += arrA[i] * mux;
			mux *= 10;
		}
		
		return tranA;
	}
}
