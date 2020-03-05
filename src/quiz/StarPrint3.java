package quiz;

public class StarPrint3 {
	public static void main(String[] args) {
		int input = 6;
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				if(input - i > j + 1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
