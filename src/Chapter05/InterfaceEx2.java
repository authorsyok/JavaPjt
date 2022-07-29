package Chapter05;

interface PhoneInterface2 {
	final int TIMEOUT = 100;
	void sendCall();
	void receiveCall();
	
	default void printLogo() {
		System.out.println("** phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface2 {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SamsungPhone2 extends PDA implements MobilePhoneInterface, MP3Interface {
	
	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");		
	}
	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ�.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SamsungPhone2 phone = new SamsungPhone2();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		phone.play();
		phone.schedule();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3,  5));
	}
}