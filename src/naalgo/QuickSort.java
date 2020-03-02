package naalgo;

public class QuickSort {
	
	
	
	public static void main(String[] args) {		
		int[] list = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		QuickSort qs = new QuickSort();
		qs.quickSort(list, 0, 9);
		qs.show(list);
	}
	
	void quickSort(int[] list, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp = 0;
		
		while(i <= j) {
			while(i <= end && list[i] <= list[key]) {
				i++;
			}
			while(j > start && list[j] >= list[key]) {
				j--;
			}
			if(i > j) {
				temp = list[j];
				list[j] = list[key];
				list[key] = temp;
			}else {
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		
		quickSort(list, start, j - 1);
		quickSort(list, j + 1, end);
	}
	
	void show(int[] list) {
		for(int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}
	}
}

//퀵 정렬 - 분할 정복 알고리즘 -> 특정 값을 기준으로 큰 숫자와 작은 숫자를 나눈다
//피벗 값(보통 첫번째)보다 작은 값을 끝에서부터 찿고 큰 값은 처음부터 찾고 찾으면 둘이 바구기를 엇갈릴 때까지 반복
//-> 작은값 인덱스랑 피봇 바꾸기
//-> 피봇 기준으로 왼쪽은 피봇 값보다 작고 오른쪽은 큼 -> 이거를 나눠진 두 집합에서 반복(재귀)
//O(N * logN)
