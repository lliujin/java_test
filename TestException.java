import java.io.*;

public class TestException {
	public static void main(String[] args) {
		new TestException().f2();
	}
	
	void f() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while (b != -1) {
			System.out.println((char)b);
			b = in.read();
		}
	}
	
	void f2() {
		try {
			f();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}