package quiz;

public class ReverseString {
	public static void main(String[] args) {
		String input = "ADEFH";
		char str[] = input.toCharArray();
		int len = str.length;
		char temp;
		for(int i = 0; i < len/2; i++) {
			temp = str[i];
			str[i] = str[len - i -1];
			str[len - i - 1] = temp;
		}
		
		String result = new String(str);
		System.out.println(result);
		
		str = input.toCharArray();
		for(int i = 0; i < len; i++) {
			System.out.print(str[len - i - 1]);
		}
	}
}
