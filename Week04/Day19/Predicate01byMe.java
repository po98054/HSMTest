package Day19;

import java.util.ArrayList;

public class Predicate01byMe {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 1, 3, "유재석", 90, 100, 100));
		
		list.add(new Student(1, 2, 4, "김국진", 95, 100, 100));
		
		list.add(new Student(1, 2, 5, "박수홍", 90, 85, 100));
		
		list.add(new Student(2, 2, 6, "김용만", 90, 100, 70));
		
		// 1학년 1반 학생들을 출력하는 코드를 작성하세요.
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getGrade() == 1 && list.get(i).getBan() == 1) {
				
				System.out.println("1학년 1반 학생들 정보 : ");
				
				System.out.println(list.get(i));
				
			}
			
		}
		
		System.out.println("-------------------------------");
		
		// 1학년 2반 학생들을 출력하는 코드를 작성하세요.
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getGrade() == 1 && list.get(i).getBan() == 2) {
				
				System.out.println("1학년 2반 학생들 정보 : ");
				
				System.out.println(list.get(i));
				
			}
			
		}
		
		System.out.println("-------------------------------");
		
		// 1학년 학생들을 출력하는 코드를 작성하세요.
		
		for(int i = 0; i < list.size(); i++) {
					
			if(list.get(i).getGrade() == 2) {
						
			   System.out.println("2학년 학생들 정보 : ");
						
			   System.out.println(list.get(i));
						
			}
					
		}
		
	}

}