package Chapter03;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10개의 정수입력");
		
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
}
