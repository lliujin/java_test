public class TestStringBuffer {
	public static void main(String[] args) {
		String s = "Microsoft";
		char[] c = { 'a', 'b', 'c' };
		StringBuffer sb1 = new StringBuffer(s);
		sb1 = sb1.append('/').append("IBM").append('/').append("Sun");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("number");
		for(int i=0; i<=9; i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		sb2.delete(8, sb2.length()).insert(0, c);
		System.out.println(sb2);
		System.out.println(sb2.reverse());
	}
}