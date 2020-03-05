package quiz;

public class PlusCycle {
	public static void main(String[] args) {
		int input = 26;
		int count = 0;
		int x = input;
//		while(true) {
//			int y = x / 10;
//			int z = x % 10;
//			x = z * 10 + (y + z) % 10;
//			count++;
//			if(x == input) break;
//		}
		do {
			int y = x / 10;
			int z = x % 10;
			x = z * 10 + (y + z) % 10;
			count++;
		}while(input != x);
		System.out.println(count);
	}
}
