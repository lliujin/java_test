import java.io.*;
public class TestFileOutputStream {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("d:/java/HelloWorld.java");
			out = new FileOutputStream("d:/java/io/HW.java");
			while((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e1) {
			System.out.println("Can not found the file!");
		} catch (IOException e2) {
			System.out.println("File copy error!");
		}
		System.out.println("File copied");
	}
}