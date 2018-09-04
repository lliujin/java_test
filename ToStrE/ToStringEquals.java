class Person {
	private String name;
	private String location;
	
	Person(String name) {
		this.name = name;
		location = "Beijing";
	}
	
	Person(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String info() {
		return "name:" + name + "location:" + location;
	}
	
	public String toString() {
		return "I'm a Person";
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else {
			if (obj instanceof Person) {
				Person p = (Person) obj;
				if (p.name == this.name && p.location == this.location)
					return true;
			}
		}
		return false;
	}
}

public class ToStringEquals {
	public static void main(String[] args) {
		Person p1 = new Person("A", "Beijing");
		Person p2 = new Person("A", "Beijing");
		System.out.println(p1.equals(p2));
		System.out.println("p1=" + p1);
		
	}
}
