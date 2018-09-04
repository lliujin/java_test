public class Person {
	int id;
	int age = 20;
	
	Person(int _id, int _age) {
		id = _id;
		age = _age;
	}
	public static void main(String[] agrs) {
		Person Tom = new Person(1, 25);
		Point P = new Point();
	}
}

class Point {
	int x;
	int y;
}