package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		Student st1 = new Student("�տ���", "1682");
		Student st2 = new Student("���Ȱ�", "1672");
		Student st3 = new Student("�����", "1813");
		
		ArrayList<Student>  list = new ArrayList<>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student s : list) {
			System.out.println("�̸�:"+s.getName() +" / �й�:" + s.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("��� �˻�: y, ����: n");
			String input = scan.next();
			boolean flag = false;
			
			if(input.equals("y")){
				System.out.println("�˻�����");
				String name = scan.next();
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println("�й��� " + s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("�˻�����");
				}
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("�˻�����");
	}
}
