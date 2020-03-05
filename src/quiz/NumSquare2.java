package quiz;

public class NumSquare2 {
	public static void main(String[] args) {
		int input = 4;
		int[] arr = new int[input];
		int count = 1;
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < input; j++) {
				if(i % 2 == 1) {
					arr[j] = count++; 
				}else {
					arr[input - j - 1] = count++;
				}
			}
			for(int j = 0; j < input; j++) {
				System.out.printf("%3d", arr[j]);
			}
			System.out.println();
		}
		
		int[][] arr2 = new int[input][input];
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				if(i % 2 == 0) {
					arr2[i][j] = i * input + j + 1;
				}else {
					arr2[i][input - j - 1] = i * input + j + 1;
				}
			}
		}
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
	}
}
