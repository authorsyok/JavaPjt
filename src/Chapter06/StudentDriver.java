package Chapter06;

import java.util.Scanner;

class Student {
	public String name;
	public int number;
	public String department;
	
	public String toString() {
		return "이름: " + name + "\n" + "학번: " + number + "\n" + "소속학과: " + department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

public class StudentDriver {
	public static void main(String[] args) {
		
		Student student1, student2;
		student1 = new Student();
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴공");
		System.out.println(student1);
		
		student2 = new Student();
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축");
		System.out.println(student2);
		
		student2.setDepartment("수학");
		System.out.println(student2);
		
		
//		String myname;
//		int num;
//		String dept;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		myname = sc.next();
//		System.out.print("학번 : ");
//		num = sc.nextInt();
//		System.out.print("소속학과 : ");
//		dept = sc.next();
//		
//		Student st1 = new Student();
//		st1.name = myname;
//		st1.number = num;
//		st1.department = dept;
//		
//		Student st2 = new Student();
//		st2.name = "갑순";
//		st2.number = 200;
//		st2.department = "건축학과";
//
//		System.out.println("이름 : " + st1.getName());
//		System.out.println("학번 : " + st1.getNumber());
//		System.out.println("소속학과 : " + st1.getDepartment());
//	
//		System.out.println("이름 : " + st2.getName());
//		System.out.println("학번 : " + st2.getNumber());
//		System.out.println("소속학과 : " + st2.getDepartment());

	}
}
