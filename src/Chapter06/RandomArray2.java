package Chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		for(int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
