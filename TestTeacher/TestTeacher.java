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
}

class Teacher extends Person {
	private String title;
	
	Teacher(String name, String title) {
		this(name, "shanghai", title);
	}
	
	Teacher(String name, String location, String title) {
		super(name, location);
		this.title = title;
	}
	
	public String info() {
		return super.info() + "professional title:" + title;
	}
}

public class TestTeacher {
	public static void main(String[] args) {
		Teacher t = new Teacher("A", "Shanghai");
		System.out.println(t.info());
	}
}