import java.io.*;
public class TestFileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		int c = 0;
		try {
			fr = new FileReader("d:/java/io/TestFileReader.java");
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e1) {
			System.out.println("找不到文件");
		} catch (IOException e2) {
			System.out.println("文件读取错误");
		}
	}
}