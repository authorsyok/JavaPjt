package Chapter09;

import java.awt.Point;

class ColorPointTwo extends Point {
	String color;

	public ColorPointTwo() {
		this(0,0);
	}
	public ColorPointTwo(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String temp = color + "색의 ("+getX()+","+getY()+") 점";
		return temp;
	}
}

public class changeColor {
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5,5);
		cp.setColor("red");
		System.out.println(cp.toString() + "입니다.");
	}
}
