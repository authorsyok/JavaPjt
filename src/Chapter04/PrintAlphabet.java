package Chapter04;

import java.util.Scanner;

public class PrintAlphabet {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		
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
