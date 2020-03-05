package quiz;

public class Snail {
	public static void main(String[] args) {
		int input = 5;
		
		int arr[][] = new int[input][input];
		int count = 1;
		int x = 0;
		int y = 0;
		int f = input;
		
		for(int i = 0; i < 2 * input - 1; i++) {
			switch(i % 4) {
			case 0:
				for(int k = 0; k < f; k++) {
					arr[y][x] = count++;
					x++;
				}
				x--;
				y++;
				f--;
				break;
			case 1:
				for(int k = 0; k < f; k++) {
					arr[y][x] = count++;
					y++;
				}
				y--;
				x--;
				break;
			case 2:
				for(int k = 0; k < f; k++) {
					arr[y][x] = count++;
					x--;
				}
				x++;
				y--;
				f--;
				break;
			case 3:
				for(int k = 0; k < f; k++) {
					arr[y][x] = count++;
					y--;
				}
				y++;
				x++;
				break;
			}
		}
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
