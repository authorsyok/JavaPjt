package Chapter04;

class Calc {
//	public static int abs(int a) {	//static�� ������ ��ü���� �ʿ����
//		return a > 0 ? a : -a;		//�ٷ� ��°���
//	}
	public  int abs(int a) {		//static������ ��ü�� �����ؾ���
		return a > 0 ? a : -a;		
	}
	public static int max(int a, int b) {
		return a > b ? a : b;		
	}
}

public class CalcEx {
	public static void main(String[] args) {
//		System.out.println(Calc.abs(-5));
		Calc c = new Calc();
		System.out.println(c.abs(-5));
		
		System.out.println(Calc.max(10, 8));
	}
}
