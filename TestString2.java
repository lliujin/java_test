public class TestString2 {
	public static void main(String[] args) {
		String s1 = "sun java", s2 = "Sun Java";
		System.out.println(s1.charAt(1));	//u
		System.out.println(s1.length());	//8
		System.out.println(s1.indexOf("java"));		//4
		System.out.println(s1.indexOf("Java"));		//-1
		System.out.println(s1.equals(s2));		//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true
		
		String s3 = "I'm learning java";
		String s4 = s3.replace('j', 'J');
		System.out.println(s4);		//I'm learning Java
	}
}