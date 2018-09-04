class A {
	protected void print(String s) {
		System.out.println(s);
	}
	A() {print("A()");}
	
	public void f(){print("A:f()");}
}

public class TestB extends A {
	TestB() {print("B()");}
	
	public void f() {print("B:f()");}
	
	public static void main(String[] args) {
		TestB b = new TestB();
		b.f();
	}
} 