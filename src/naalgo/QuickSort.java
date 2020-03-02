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

//�� ���� - ���� ���� �˰��� -> Ư�� ���� �������� ū ���ڿ� ���� ���ڸ� ������
//�ǹ� ��(���� ù��°)���� ���� ���� ���������� �O�� ū ���� ó������ ã�� ã���� ���� �ٱ��⸦ ������ ������ �ݺ�
//-> ������ �ε����� �Ǻ� �ٲٱ�
//-> �Ǻ� �������� ������ �Ǻ� ������ �۰� �������� ŭ -> �̰Ÿ� ������ �� ���տ��� �ݺ�(���)
//O(N * logN)
