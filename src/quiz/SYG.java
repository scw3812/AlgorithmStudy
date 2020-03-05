package quiz;

public class SYG {
	public static void main(String[] args) {
		int n = 100;
		SYG syg = new SYG();
		for(int i = 1; i <= n; i++) {
			int cnt = syg.getNum(i);
			switch(cnt) {
				case 0:
					System.out.print(i + " ");
					break;
				case 1:
					System.out.print("¦ ");
					break;
				case 2:
					System.out.print("¦¦ ");
					break;
			}
		}
	}
	

	public int getNum(int i) {
		int j = 0;
		while(i > 0) {
			if(i % 10 != 0 && (i % 10) % 3 == 0) {
				j++;
			}
			i /= 10;
		}
		return j;
	}
}
