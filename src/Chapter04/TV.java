package Chapter04;

public class TV {

	String name;
	int year;
	int inch;
	
	void show() {
		System.out.println(name +"���� ���� " +year+"���� " +inch+"��ġ TV");
	}
		
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
