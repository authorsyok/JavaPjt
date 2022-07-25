package Chapter04;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random r = new Random();
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(10) + 1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(sum / 10.0);
	}
}
