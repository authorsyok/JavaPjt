package Chapter11;

class Point {
	private int x, y;
	public Point(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y ) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	   private int z;
	   public Point3D(int x, int y, int z) {
	      super(x,y);
	      this.z = z;
	   }
	   public void moveUp( ) {
	      z++;
	   }
	   public void moveDown() {
	      z--;
	   }
	   public void move(int x, int y, int z) {
	      move(x, y);
	      this.z = z;
	   }
	   public String toString() {
	      String tmp = "("+getX()+","+getY()+","+z+") �� ��"; 
	      return tmp;
	   }
	}

public class PointTest {
	public static void main(String[] args) {
		
		//1,2,3�� ���� x,y,z ���� ��
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "�Դϴ�.");
	
		p.moveUp();	//z������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");

		p.moveDown(); //z������ �Ʒ��� �̵�
		p.move(10, 10); //x, y������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
	
		p.move(100, 200, 300); // x, y, z������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");		
	}
}