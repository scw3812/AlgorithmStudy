package naalgo;

public class SelectionSort {
			
	public static void main(String[] args) {
		int min = 0;
		int temp = 0;
		int index = 0;
		int[] list = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		for(int i = 0; i < 10; i++) {
			min = 9999;
			for(int j = i; j < 10; j++) {
				if(min > list[j]) {
					min = list[j];
					index = j;
				}
			}
			temp = list[i];
			list[i] = min;
			list[index] = temp;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}
	}
}

//���� ���� - ���� ���� ���� ������ ���� ������ ������
//���� ���� ���� ã�� �ݺ������� ã�� �� ���� ���� ���� �ٲٱ⸦ �ݺ�
//O(N*N)
