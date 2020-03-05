package naalgo;

public class MergeSort {
	int n = 8;
	int sorted[] = new int[8];
	
	public static void main(String[] args) {
		int array[] = {7, 6, 5, 8, 4, 5, 9, 1};
		MergeSort ms = new MergeSort();
		ms.mergeSort(array, 0, ms.n - 1);
		for(int i = 0; i < ms.n; i++) {
			System.out.println(array[i]);
		}
	}
	
	void merge(int a[], int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		
		while(i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		if(i > middle) {
			for(int t = j; t <= n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}else {
			for(int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		for(int t = m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}
	
	void mergeSort(int a[], int m, int n) {
		if(m < n) {
			int middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}
	}
}

//병합정렬은 반으로 쪼개서 나중에 합치는 정렬
//nlogn을 항상 보장
//새로운 배열(sorted)이 필요하므로 공간복잡도가 높아짐