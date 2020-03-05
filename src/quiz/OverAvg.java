package quiz;

public class OverAvg {
	public static void main(String[] args) {
		int in[] = {7, 100, 95, 90, 80, 70, 60, 50};
		int sum = 0;
		for(int i = 1; i < in.length; i++) {
			sum += in[i];
		}
		
		double avg = (double)sum / in[0];
		
		int count = 0;
		for(int i = 1; i < in.length; i++) {
			if(in[i] > avg) {
				count++;
			}
		}
		
		System.out.println((double)count / in[0] * 100);
	}
}
