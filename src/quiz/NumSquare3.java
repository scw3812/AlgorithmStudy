package quiz;

public class NumSquare3 {
	public static void main(String[] args) {
		int input = 4;
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.printf("%3d", i + j * input);
			}
			System.out.println();
		}
		
		int arr[][] = new int[input][input];
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				arr[j][i] = i * input + j + 1;
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
