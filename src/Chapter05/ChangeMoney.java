package Chapter05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		int[] arr = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		
		int n = sc.nextInt();
		
//==========================================================================
		
		for(int i = 0; i < arr.length; i++) {
			int result = n / arr[i];
			
			if(result >0) {
				System.out.println(arr[i] + "��¥�� : " + result + "��");
				n %= arr[i];
			}
		}
		
//		while(true) {
//			System.out.println("5����¥�� : " + (n / 50000));
//			n %= 50000;
//			System.out.println("1����¥�� : " + (n / 10000));
//			n %= 10000;
//			System.out.println("1000��¥�� : " + (n / 1000));
//			n %= 1000;
//			System.out.println("100��¥�� : " + (n / 100));
//			n %= 100;
//			System.out.println("10��¥�� : " + (n / 10));
//			n %= 10;
//			System.out.println("1��¥�� : " + (n / 1));
//			n %= 1;
//			if(n == 0) 
//				break;
//		}
	}
}
