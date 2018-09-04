interface CarePet {
	public void feed();
	public void play();
}

class Worker {
	public void feed() {
		System.out.println("worker feed");
	}
	public void play() {
		System.out.println("play with worker");
	}
}

class Peasant {
	public void feed() {
		System.out.println("peasant feed");
	}
	public void play() {
		System.out.println("play with peasant");
	}
}

class Leader {
	public void feed() {
		System.out.println("leader feed");
	}
	public void play() {
		System.out.println("play with leader");
	}
}
public class Interface {
	public static void main(String[] args) {
		Worker w = new Worker();
		Peasant p = new Peasant();
		Leader d = new Leader();
		w.feed();w.play();
		p.feed();p.play();
		d.feed();d.play();
	}
}
