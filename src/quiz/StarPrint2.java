package quiz;

public class StarPrint2 {
	public static void main(String[] args) {
		int input = 5;
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				if(j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
