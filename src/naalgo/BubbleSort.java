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

//���� ���� - ���� �ִ� ���� ���ؼ� �� ���� ���� ������ ������ -> ȿ������ ���� ����
//�� �� �����ϸ� ���� ū ���� �ǵڷ� ���� -> �̰� n�� �ݺ��ϸ� ��
//O(N*N)