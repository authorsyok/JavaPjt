package Chapter06;

class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		//class의 이름을 출력해줌
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		//객체값을 문자열로 출력
		System.out.println(obj.toString());
		//윗문장과 같음
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
