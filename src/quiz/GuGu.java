package quiz;

public class GuGu {
	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		
		for(int i = 1; i <= 9; i++) {
			for(int j = s; j <= f; j++) {
				System.out.printf("%2d *%2d =%3d", j, i, i * j);
			}
			System.out.println();
		}
	}
}
