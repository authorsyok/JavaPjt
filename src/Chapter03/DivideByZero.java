package Chapter03;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("�����Է�: ");
		dividend= sc.nextInt();
		System.out.print("�����Է�: ");
		divisor= sc.nextInt();
	
		System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
	}
}
