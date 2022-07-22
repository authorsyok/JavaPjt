package Chapter03;

import java.util.Scanner;

public class CoronaSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = {{11,12,13}, {21,22,23}, {31,32,33}, {41,42,43}, {51,52,53}, {61,62,63}, {71,72,73}, {81,82,83}, {91,92,93}, {101,102,103}, {111,112,113}, {121,122,123}};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 " + sum);
	}
}
