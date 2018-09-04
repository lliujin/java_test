class Animal {
	private String name;
	Animal(String name) {
		this.name = name;
	}
	
	public void enjoy() {
		System.out.println("scream");
	}
}

class Cat extends Animal {
	private String eyesColor;
	Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}
	
	public void enjoy() {
		System.out.println("miao");
	}
}

class Dog extends Animal {
	private String furColor;
	Dog(String n, String f) {
		super(n);
		furColor = f;
	}
	
	public void enjoy() {
		System.out.println("wangwang");
	}
}

class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class Test {
	public static void main(String[] args) {
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		Lady l1 = new Lady("l1", c);
		Lady l2 = new Lady("l2", d);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
	}
}


