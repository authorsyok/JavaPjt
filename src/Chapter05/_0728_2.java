package Chapter05;

import java.util.Scanner;

public class _0728_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		String str[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.println("가위 바위 보 입력하세요");
			int number = (int)(Math.random() * 3);
			String s = sc.next();
			if(s.equals("그만")) 
				break;
			
			if(s.equals("가위")) {
				if(str[number].equals("가위")) System.out.println("비겼습니다.");
				else if(str[number].equals("바위")) System.out.println("컴퓨터가 이겼습니다.");
				else System.out.println("사용자가 이겼습니다.");
			}
			else if(s.equals("바위")) {
				if(str[number].equals("가위")) System.out.println("사용자가 이겼습니다..");
				else if(str[number].equals("바위")) System.out.println("비겼습니다.");
				else System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(s.equals("보")) {
				if(str[number].equals("가위")) System.out.println("컴퓨터가 이겼습니다.");
				else if(str[number].equals("바위")) System.out.println("사용자가 이겼습니다.");
				else System.out.println("비겼습니다.");
			}
			else System.out.println("다시 입력하세요");
		}
	}
}

