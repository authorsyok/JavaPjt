package Chapter05;

import java.util.Scanner;

public class Trapezoid {
	public static void main(String[] args) {

		getArea();
	}

	private static void getArea() {
		Scanner sc = new Scanner(System.in);

		int down = sc.nextInt();
		int up = sc.nextInt();
		int height = sc.nextInt();
		
		double sum = (double)((up + down) * height / 2);
		System.out.println("��ٸ����� ���̴� " + sum);		
	}
}
