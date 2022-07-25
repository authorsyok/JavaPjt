package Chapter04;

class Circle3 {
	int radius;
	
	public Circle3(int r) {
		this.radius = r;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
	
		Circle3[] c = new Circle3[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle3(i);
			System.out.println((int)c[i].getArea());
		}
	}
}
