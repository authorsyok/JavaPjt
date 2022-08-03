package Chapter07;

class Box2<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<>();
		box2.set("hello");
		String greeting = box2.get();
		System.out.println(greeting);
		
		Box2<Integer> box3 = new Box2<>();
		box3.set(6);
		int value = box3.get();
		System.out.println(value);
	}
}
