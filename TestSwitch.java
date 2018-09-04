public class TestSwitch {
	public static void main(String[] args) {
		int i = 2;
		switch(i) {
			case 1:
				System.out.println("A");
				break;
			case 2:
			case 3:
				System.out.println("B");
				break;
			default:
				System.out.println("C");
		}
	}
}