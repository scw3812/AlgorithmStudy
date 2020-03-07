package quiz;

public class Fibonacci {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		//an = an - 1 + an - 2
		//a1 = 1, a2 = 1
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		int prevPrevNum = 0;
		int prevNum = 1;
		System.out.println(prevPrevNum);
		System.out.println(prevNum);
		for(int i = 0; i < 10; i++) {
			int nowNum = prevPrevNum + prevNum;
			System.out.println(nowNum);
			prevPrevNum = prevNum;
			prevNum = nowNum;			
		}
	}
}
