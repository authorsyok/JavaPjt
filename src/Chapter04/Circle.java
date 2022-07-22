package Chapter04;

public class Circle {
	
	static int radius;
	static String name;
	
	public Circle() {}	// 클래스명과 같은 메서드는 생성자 그냥 만들어주자
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "미스터피자";
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 넓이는 " + pizza.getArea() + "이다.");
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "던킨";
		double area2 = donut.getArea();
		
		System.out.println(pizza.name + "의 넓이는 " + donut.getArea() + "이다.");
		
	}
}
