import java.io.*;

public class TestFileInputStream {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		try {
			in = new FileInputStream("d:/java/io/TestFileInputStream.java");
		} catch (FileNotFoundException e1) {
			System.out.println("Can not found the file!");
			System.exit(-1);
		}
		
		try {
			long num = 0;
			while((b = in.read()) != -1) {
				System.out.print((char)b);
				num ++;
			}
			in.close();
			System.out.println();
			System.out.println("The number of bytes in this file is:" + num);
		} catch (IOException e2) {
			System.out.println("File read error!");
			System.exit(-1);
		}
	}
}