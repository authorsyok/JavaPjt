package Chapter07;

class Apple extends Object{

}

class Box {
	private Object object;
	
	public Object get() {
		return object;
	}
	
	public void set(Object object) {
		this.object = object;
	}
}

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");
		String name = (String) box.get();
		System.out.println(name);		
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);		
	}
}
