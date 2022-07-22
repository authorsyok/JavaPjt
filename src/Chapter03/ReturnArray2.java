package Chapter03;

import java.util.Scanner;

public class ReturnArray2 {
	
	static int[] makeArray() {
		int temp[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			temp[i] = i + 1;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + 100 + " ");
		}
		
	}
}
