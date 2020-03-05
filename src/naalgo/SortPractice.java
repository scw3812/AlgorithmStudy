package naalgo;

import java.util.Scanner;

public class SortPractice {
	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] array = new int[n + 1];
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		SortPractice sp = new SortPractice();
		sp.quickSort(array, 0, n - 1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
	
	//백만 정도는 코테에서 문제 없음
	void selectSort(int[] array, int n) {
		 int min = 0, index = 0, temp = 0;
		 for(int i = 0; i < n; i++) {
			 min = 1001;
			 for(int j = i; j < n; j++) {
				 if(min > array[j]) {
					 min = array[j];
					 index = j;
				 }	 
			 }
			 temp = array[i];
			 array[i] = array[index];
			 array[index] = temp;
		 }
	}
	
	//백만개 정렬에서는 n*logn인 것으로 정렬
	void quickSort(int[] array, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp = 0;
		
		while(i <= j) {
			while(i <= end && array[i] <= array[key]) {
				i++;
			}
			while(j > start && array[j] >= array[key]) {
				j--;
			}
			if(i > j) {
				temp = array[key];
				array[key] = array[j];
				array[j] = temp;
			}else {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		quickSort(array, start, j - 1);
		quickSort(array, j + 1, end);
	}
}
