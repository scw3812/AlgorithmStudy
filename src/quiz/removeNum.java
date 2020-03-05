package quiz;

public class removeNum {
	public static void main(String[] args) {
		boolean arr[] = new boolean[101];
		int inArr[] = new int[101];
		inArr[0] = 1;
		inArr[1] = 2;
		inArr[2] = 3;
		inArr[3] = 4;
		inArr[4] = 5;
		inArr[5] = 7;
		inArr[6] = 3;
		inArr[7] = 15;
		inArr[8] = 7;
		
		for(int a : inArr) {
			arr[a] = true;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]) System.out.print(i + " ");
		}
	}
}
