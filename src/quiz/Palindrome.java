package quiz;

public class Palindrome {
	public static void main(String[] args) {
		String n = "1221";
		int len = n.length();
		boolean flag = true;
		for(int i = 0; i < len / 2; i++) {
			if(n.charAt(i) != n.charAt(len - i - 1)){
				flag = false;
			}
		}
		System.out.println(flag);
	}
}
