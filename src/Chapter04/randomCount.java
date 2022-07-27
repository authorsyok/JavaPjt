package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class randomCount {
	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 10) + 1;	//1부터 10사이의 수
		int guessnum = 0;						//추측한 숫자
		
		Scanner sc = new Scanner(System.in);	//입력
		
		System.out.print("추측한 숫자를 입력하세요 : ");
		
		while(true) {							//횟수 정해져있지 않아서 while
			guessnum = sc.nextInt();			//추측한 숫자를 입력하고
			
			if(guessnum == n) {					//추측한 수와 랜덤수가 같다면
				System.out.println("정답입니다.");
				break;							//정답출력 후 break
			}
			if(guessnum > n) {					//추측수가 크다면 
				System.out.println("값이큽니다.");
			}
			else {								//추측수가 작다면
				System.out.println("값이 작습니다.");
			}
		}
	}
}
