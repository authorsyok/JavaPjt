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
		System.out.print("성을 입력하세요 : ");
		lname = sc.next();
		System.out.print("이름을 입력하세요 : ");
		fname = sc.next();
		
		person1 = new Person2();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println("성: " + person1.getLastName());
		System.out.println("이름: " + person1.getFirstName());
		System.out.println("성명의 길이: " + person1.getLength());
	}
}
