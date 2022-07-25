package Chapter04;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		int number;
		Random r = new Random();
		
		while(true) {
			number = r.nextInt(10) + 1;
			System.out.println(number);
			
			if(number == 7) {
				break;
			}
		}
		
	}
}
