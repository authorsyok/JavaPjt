package Chapter05;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		
		int years = 0;		
		double balance = 0;			

		Scanner sc = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요 : ");
		int principal = sc.nextInt();
		
		System.out.print("연이율을 입력하세요 : ");
		double rate = sc.nextDouble();
		
		balance = principal;

		System.out.println("\n연도수\t원리금");
		
		do {
			years++;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years + "\t" + balance);
		} while(balance <= principal * 2.0);
		
		System.out.println("필요 연도수 : " + years);
	}
}
