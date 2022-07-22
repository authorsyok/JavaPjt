package Chapter04;

import java.util.Scanner;

public class PrintAlphabet {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		
		String str = sc.next();
		char ch = str.charAt(0);
	
		for(int i = 0; i <= ch - 'a'; i++) {
			for(int j = 'a'; j <= ch - i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
