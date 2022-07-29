package Chapter05;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Shape sh = new Shape();
		Line li = new Line();
		Shape sh2 = new Line();	//��ĳ���� : Line���� ���� 

		paint(sh);
		paint(new Shape());	//���ٰ� ���� : Shape
		System.out.println("===================================");
		
		System.out.println("===================================");
		paint(li);
		paint(new Line());	//			:Line
		
		System.out.println("===================================");
		paint(sh2);			//		  :Line

		System.out.println("===================================");
		paint(new Rect());	//			:Rect
		
		System.out.println("===================================");
		paint(new Circle());//			:Circle
	
	}
}
