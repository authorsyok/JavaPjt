package Chapter04;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10개 입력 : ");
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
			else
				continue;
		}
	}
}
