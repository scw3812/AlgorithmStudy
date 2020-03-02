package naalgo;

public class InsertionSort {
	public static void main(String[] args) {
		int[] list = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		int j = 0;
		for(int i = 0; i < 9; i++) {
			j = i;
			while(list[j] > list[j + 1]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}
	}
}

//삽입정렬 - 각 숫자를 '적절한 위치'에 삽입
//적절한 위치 -> 필요할 때만 위치를 바꾼다는 의미
//거의 정렬된 상태에서는 가장 빠름
//O(N*N)