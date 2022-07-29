package Chapter05;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
//		new RemoteControl();
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
			
		};
		rc.turnOn();
		rc.turnOff();
	}
}
