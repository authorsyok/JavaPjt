package Chapter08;

class MyPoint {
	
	int one;
	int two;
	
	public MyPoint(int x, int y) {
		this.one = x;
		this.two = y;
	}
	public String toString() {
		return "point(" + one + ", " + two +")";
	}
}

public class myPointTest {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(3, 50);
		System.out.println(p);
		if(p.equals(q)) System.out.println("������");
		else System.out.println("�ٸ���");
	}
}
