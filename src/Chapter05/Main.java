package Chapter05;

abstract class Animal {
	public int life = 1;
}

abstract class Bird extends Animal {		
	public int wing = 2;
	void walk() { System.out.println("walk");}
	void eat()  { System.out.println("eat"); }
}

//�������̽� ��ӹ��� �� implements ���	
class Penguin extends Bird implements Swim2{
	@Override
	public void swim() {		
		System.out.println("penguin swim");
	}	
}

class Duck extends Bird implements Swim2, Fly2 {
	@Override
	public void swim() {
		System.out.println("duck swim");		
	}

	@Override
	public void fly() {
		System.out.println("duck fly");
	}		
}

abstract class Swim {
	abstract void swim();
}

interface Swim2 {
	abstract void swim();
}

interface Fly2 {
	abstract void fly();
}

public class Main {
	public static void main(String[] args) {
		Animal a;
//		a = new Animal();	�߻�Ŭ������ ��ü �����Ұ�
		Bird b;				
		Penguin p = new Penguin();
		p.swim();
		
		Bird p2 = new Penguin();	//��ĳ����
		p2.walk(); 					//��ĳ����
		
		Penguin p3 = (Penguin) p2;	//�ٿ�ĳ����
		p3.swim();
		
		Bird d = new Duck();		//��ĳ����
		d.eat();
		
		Duck d2 = (Duck) d;			//�ٿ�ĳ����
		d2.fly();
		d2.swim();
		
		Animal d3 = new Duck();		//��ĳ����
		int x = d3.life;
		System.out.println("x : " + x);
		
		Swim2 s = new Penguin();	//�ر��� ��ü�� �ִ°Ŷ� �տ� �������̽��� �͵� ������� ��ü���� ������
		s.swim();
		
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin();
		s2[1] = new Duck();
	}
}