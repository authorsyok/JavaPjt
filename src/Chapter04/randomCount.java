package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class randomCount {
	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 10) + 1;	//1���� 10������ ��
		int guessnum = 0;						//������ ����
		
		Scanner sc = new Scanner(System.in);	//�Է�
		
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		
		while(true) {							//Ƚ�� ���������� �ʾƼ� while
			guessnum = sc.nextInt();			//������ ���ڸ� �Է��ϰ�
			
			if(guessnum == n) {					//������ ���� �������� ���ٸ�
				System.out.println("�����Դϴ�.");
				break;							//������� �� break
			}
			if(guessnum > n) {					//�������� ũ�ٸ� 
				System.out.println("����Ů�ϴ�.");
			}
			else {								//�������� �۴ٸ�
				System.out.println("���� �۽��ϴ�.");
			}
		}
	}
}
