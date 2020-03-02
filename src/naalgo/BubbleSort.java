package naalgo;

public class BubbleSort {
	public static void main(String[] args) {
		int[] list = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9 - i; j++) {
				if(list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}
	}
}

//버블 정렬 - 옆에 있는 값과 비교해서 더 작은 값을 앞으로 보내기 -> 효율성이 가장 낮음
//한 번 실행하면 가장 큰 값이 맨뒤로 간다 -> 이걸 n번 반복하면 됨
//O(N*N)