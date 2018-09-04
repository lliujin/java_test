public class TestVar {
	
	static int j = 0;
	
	public void m() {
		int i = 1;
		System.out.println(i);
	}
	
	public static void  main(String[] args) {
		int i = 2;
		System.out.println(i);
		System.out.println(j);
		
		boolean b = false;
		if (b) {
			System.out.println("b is ture");
		}
	}

}