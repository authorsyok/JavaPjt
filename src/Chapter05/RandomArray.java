package Chapter05;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");
		}
	}
}
