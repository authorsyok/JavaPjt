package Chapter05;

abstract class Animal {
	public int life = 1;
}

abstract class Bird extends Animal {		
	public int wing = 2;
	void walk() { System.out.println("walk");}
	void eat()  { System.out.println("eat"); }
}

//인터페이스 상속받을 때 implements 사용	
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
//		a = new Animal();	추상클래스는 객체 새성불가
		Bird b;				
		Penguin p = new Penguin();
		p.swim();
		
		Bird p2 = new Penguin();	//업캐스팅
		p2.walk(); 					//업캐스팅
		
		Penguin p3 = (Penguin) p2;	//다운캐스팅
		p3.swim();
		
		Bird d = new Duck();		//업캐스팅
		d.eat();
		
		Duck d2 = (Duck) d;			//다운캐스팅
		d2.fly();
		d2.swim();
		
		Animal d3 = new Duck();		//업캐스팅
		int x = d3.life;
		System.out.println("x : " + x);
		
		Swim2 s = new Penguin();	//팽귄은 실체가 있는거라 앞에 인터페이스가 와도 상관없이 객체생성 가능함
		s.swim();
		
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin();
		s2[1] = new Duck();
	}
}