package quiz;

public class ChangeLU {
	public static void main(String[] args) {
		String input = "HellowWorld";
		char[] arr = input.toCharArray();
		
		//�빮�ڿ� �ҹ��� ���̴� �ҹ��� - �빮�� = 32
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				 arr[i] = (char)(arr[i] + ('a' - 'A'));
			}else if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] - ('a' - 'A'));
			}
		}
		
		for(char c : arr) {
			System.out.print(c);
		}
	}
}
