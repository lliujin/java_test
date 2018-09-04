interface Valuable {
	public double getMoney();
}

interface Protectable {
	public void beProtected();
}

interface A extends Protectable {
	void m();
}

abstract class Animal {
	private String name;
	
	abstract void enjoy();
} 

public class GoldenMoney extends Animal implements Valuable, Protectable {
	public double getMoney() {
		return 10000;
	}
	
	public void beProtected() {
		System.out.println("live in the room");
	}
	
	public void enjoy() {}
	
	public static void main(String[] args) {
		Valuable v = new GoldenMoney();
		v.getMoney();
		Protectable p = (Protectable)v;
		p.beProtected();
	}
}