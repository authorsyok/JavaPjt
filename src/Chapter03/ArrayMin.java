package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
			
		System.out.println("양수 몇 개 입력");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		
		if(min > arr[0]) {
			min = arr[0];
		}
		System.out.println(min);
	}
}
