package Chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개입력");
		
		int n = 0, sum = 0;
		
		for(int i = 1; i <= 3; i++) {
			System.out.print(i + ": ");
			try {
				n = sc.nextInt();				
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시입력");
				sc.next();
				i--;
				continue;
			}
			sum += n;
		}
		
		System.out.println(sum);
	}
}
