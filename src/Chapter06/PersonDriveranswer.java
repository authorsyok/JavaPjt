package Chapter06;

import java.util.Scanner;

class Person2 {
	public String lastName;
	public String firstName;
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return lastName.length() + firstName.length();
	}
}

public class PersonDriveranswer {
	public static void main(String[] args) {
		
		String fname;
		String lname;
		Person2 person1;
		Person2 person2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		lname = sc.next();
		System.out.print("�̸��� �Է��ϼ��� : ");
		fname = sc.next();
		
		person1 = new Person2();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println("��: " + person1.getLastName());
		System.out.println("�̸�: " + person1.getFirstName());
		System.out.println("������ ����: " + person1.getLength());
	}
}
