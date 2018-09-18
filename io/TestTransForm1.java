import java.io.*;
public class TestTransForm1 {
	public static void main(String[] args) {
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:/java/char.txt"));
			osw.write("microsoft");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("d:/java/char.txt", true), "ISO8859_1");
			osw.write("microsoft");
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}