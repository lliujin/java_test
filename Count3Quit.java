public class Count3Quit {
	public static void main(String[] args) {
		boolean a[] = new boolean[500];
		for(int i=0; i<a.length; i++) {
			a[i] = true;
		}
		
		int leftCount = a.length;
		int countNum = 0;
		int index = 0;
		
		while(leftCount > 1) {
			if(a[index] == true) {
				countNum ++;
				if(countNum == 3) {
					countNum = 0;
					a[index] = false;
					leftCount --;
				}
			}	
			index ++;
			
			if(index == a.length) {
				index = 0;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == true) {
				System.out.println(i);
			}
		}
	}
}