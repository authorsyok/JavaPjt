package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
			
		System.out.println("��� �� �� �Է�");
		
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
