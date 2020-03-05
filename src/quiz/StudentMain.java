package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1672");
		Student st3 = new Student("사오정", "1813");
		
		ArrayList<Student>  list = new ArrayList<>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student s : list) {
			System.out.println("이름:"+s.getName() +" / 학번:" + s.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색: y, 종료: n");
			String input = scan.next();
			boolean flag = false;
			
			if(input.equals("y")){
				System.out.println("검색시작");
				String name = scan.next();
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println("학번은 " + s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("검색실패");
				}
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("검색종료");
	}
}
