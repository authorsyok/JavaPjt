package Chapter09;

class TV {
	   protected int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() {return size;}
	}
	class ColorTV extends TV {
	   public int colors;
	   public ColorTV(int colors, int size) {
	      super(size);
	      this.colors = colors;
	   }
	public void printProperty() {
		System.out.println(colors + "��ġ " + size + "�÷�");
	}
}
	
public class ColorTVTest {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
