package Chapter04;

public class BabySum {
	public static void main(String[] args) {
		
		int[][] arr = new int[120][5];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * 100 + j + 1;
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
