package Chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend;
		int divisor;

		while(true) {	
			System.out.print("�����Է�: ");
			dividend= sc.nextInt();
			System.out.print("�и��Է�: ");
			divisor= sc.nextInt();
			
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
	}
}
