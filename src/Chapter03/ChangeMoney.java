package Chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		int[] arr = {50000, 10000, 1000, 500, 100, 50, 10, 1};

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� : ");
		
		int n = sc.nextInt();		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "�� : " + (n / arr[i]));
			n %= arr[i];
		}
	}
}
