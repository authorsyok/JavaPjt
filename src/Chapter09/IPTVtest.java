package Chapter09;

class IPTV extends ColorTV {

	static String iptv;

	
	public IPTV(String iptv, int colors, int size) {
		super(colors, size);
		this.iptv = iptv;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + iptv + "주소의 " + colors + "인치 " + size + "컬러");
	}
}

public class IPTVtest {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
