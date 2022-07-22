package Chapter04;

import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,14,13,12,11};
		int max = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		Arrays.sort(arr);
		
		int sum = arr[0] + arr[arr.length-1];
		
		System.out.println(sum);
		
		
	}
}
