package Chapter04;

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle() {}
	
	public double getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();

		System.out.println(rect.getArea());
	}
}
