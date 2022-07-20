package Chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend;
		int divisor;

		while(true) {	
			System.out.print("분자입력: ");
			dividend= sc.nextInt();
			System.out.print("분모입력: ");
			divisor= sc.nextInt();
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
	}
}
