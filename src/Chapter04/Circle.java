package Chapter04;

public class Circle {
	
	static int radius;
	static String name;
	
	public Circle() {}	// Ŭ������� ���� �޼���� ������ �׳� ���������
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�̽�������";
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "�� ���̴� " + pizza.getArea() + "�̴�.");
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "��Ų";
		double area2 = donut.getArea();
		
		System.out.println(pizza.name + "�� ���̴� " + donut.getArea() + "�̴�.");
		
	}
}
