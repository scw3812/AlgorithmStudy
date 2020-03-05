package quiz;

public class NumSquare {
	public static void main(String[] args) {
		int input = 5;
		int count = 1;
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.printf("%3d",count++);
			}
			System.out.println();
		}
		
		for(int i = 0; i < input; i++) {
			for(int j = 1; j <= input; j++) {
				System.out.printf("%3d",i * input + j);
			}
			System.out.println();
		}
	}
}
