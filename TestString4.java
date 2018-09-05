public class TestString4 {
	public static void main(String[] args) {
		int n = 134567;
		String sNum = String.valueOf(n);
		System.out.println(sNum.length());
		
		String s = "Mary,F,1995";	
		String[] sP = s.split(",");
		for(int i=0; i<s.length(); i++) {
			System.out.println(sP[i]);
		}
	}
}