package Chapter06;

import java.util.Scanner;

class Student {
	public String name;
	public int number;
	public String department;
	
	public String toString() {
		return "�̸�: " + name + "\n" + "�й�: " + number + "\n" + "�Ҽ��а�: " + department;
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
		student1.setName("����");
		student1.setNumber(100);
		student1.setDepartment("�İ�");
		System.out.println(student1);
		
		student2 = new Student();
		student2.setName("����");
		student2.setNumber(200);
		student2.setDepartment("����");
		System.out.println(student2);
		
		student2.setDepartment("����");
		System.out.println(student2);
		
		
//		String myname;
//		int num;
//		String dept;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸� : ");
//		myname = sc.next();
//		System.out.print("�й� : ");
//		num = sc.nextInt();
//		System.out.print("�Ҽ��а� : ");
//		dept = sc.next();
//		
//		Student st1 = new Student();
//		st1.name = myname;
//		st1.number = num;
//		st1.department = dept;
//		
//		Student st2 = new Student();
//		st2.name = "����";
//		st2.number = 200;
//		st2.department = "�����а�";
//
//		System.out.println("�̸� : " + st1.getName());
//		System.out.println("�й� : " + st1.getNumber());
//		System.out.println("�Ҽ��а� : " + st1.getDepartment());
//	
//		System.out.println("�̸� : " + st2.getName());
//		System.out.println("�й� : " + st2.getNumber());
//		System.out.println("�Ҽ��а� : " + st2.getDepartment());

	}
}
