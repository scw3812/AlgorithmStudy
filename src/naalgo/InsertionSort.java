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

//�������� - �� ���ڸ� '������ ��ġ'�� ����
//������ ��ġ -> �ʿ��� ���� ��ġ�� �ٲ۴ٴ� �ǹ�
//���� ���ĵ� ���¿����� ���� ����
//O(N*N)