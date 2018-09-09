public class TestString5 {
	public static void main(String[] args) {
		String s = "AaaaABBBBxlfksr _stjr55&^*^*65jk";
		int lCount = 0, uCount = 0, oCount = 0;
		//the first option
		/*for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z') {
				lCount ++;
			} else if(c >= 'A' && c <= 'Z') {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		*/
		
		//the second option
		/*String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(s1.indexOf(c) != -1) {
				lCount ++;
			} else if(s2.indexOf(c) != -1) {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		*/
		
		//the third option
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				lCount ++;
			} else if(Character.isUpperCase(c)) {
				uCount ++;
			} else {
				oCount ++;
			}
		}
		System.out.println(lCount + " " + uCount + " " + oCount + " ");
		//System.out.println(lCount + ' ' + uCount + ' ' + oCount + ' ');    Error:the result is 128
	}
}