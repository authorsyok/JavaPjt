package Chapter05;

import java.util.Scanner;

public class _0728_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		String str[] = {"����", "����", "��"};
		
		while(true) {
			System.out.println("���� ���� �� �Է��ϼ���");
			int number = (int)(Math.random() * 3);
			String s = sc.next();
			if(s.equals("�׸�")) 
				break;
			
			if(s.equals("����")) {
				if(str[number].equals("����")) System.out.println("�����ϴ�.");
				else if(str[number].equals("����")) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else System.out.println("����ڰ� �̰���ϴ�.");
			}
			else if(s.equals("����")) {
				if(str[number].equals("����")) System.out.println("����ڰ� �̰���ϴ�..");
				else if(str[number].equals("����")) System.out.println("�����ϴ�.");
				else System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(s.equals("��")) {
				if(str[number].equals("����")) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[number].equals("����")) System.out.println("����ڰ� �̰���ϴ�.");
				else System.out.println("�����ϴ�.");
			}
			else System.out.println("�ٽ� �Է��ϼ���");
		}
	}
}

