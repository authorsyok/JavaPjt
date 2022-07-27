package Chapter04;

class Calc {
//	public static int abs(int a) {	//static이 있으면 객체생성 필요없음
//		return a > 0 ? a : -a;		//바로 출력가능
//	}
	public  int abs(int a) {		//static없으면 객체를 생성해야함
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
