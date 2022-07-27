package Chapter04;

import java.util.Scanner;

class CurrencyConver {
	private static double rate;
	public static double toDollar(double won) { return won / rate; }
	public static double toKWR(double dollar) { return dollar * rate; }
	public static void setRate(double r) { rate = r; }
}

public class StaticMember {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1´Þ·¯ : ");
		double rate = sc.nextDouble();	
		CurrencyConver.setRate(rate);
		
		System.out.println((int)CurrencyConver.toDollar(1000000));
		System.out.println((int)CurrencyConver.toKWR(100));	
	}
}
