package Chapter09;

class IPTV extends ColorTV {

	static String iptv;

	
	public IPTV(String iptv, int colors, int size) {
		super(colors, size);
		this.iptv = iptv;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� " + iptv + "�ּ��� " + colors + "��ġ " + size + "�÷�");
	}
}

public class IPTVtest {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
