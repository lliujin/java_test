public class TestString3 {
	public static void main(String[] args) {
		String s = "Welcome to Java World!";
		String s1 = "   sun java   ";
		
		System.out.println(s.startsWith("Welcome"));		//true
		System.out.println(s.endsWith("World"));	//fslse
		
		String sU = s.toUpperCase();
		System.out.println(sU);		//"WELCOME TO JAVA WORLD!"
		String sL = s.toLowerCase();
		System.out.println(sL);		//"welcome to java world!"
		
		String subS1 = s.substring(11);		//substring,not subString
		System.out.println(subS1);	//"Java World!"
		String subS2 = s.substring(11, 15);		//11 <= index < 15
		System.out.println(subS2);   //java
		
		System.out.println(s1.trim());    //"sun java"
	}
}