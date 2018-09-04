public class TestConvert {
	public static void main(String[] args) {
		int l1 = 123;
		int l2 = 456;
		double d1 = (l1 + l2) * 1.2;//中文
		float f1 = (float)((l1 + l2) * 1.2);
		byte b1 = 67;//
		byte b2 = 89;
		byte b3 = (byte)(b1 + b2);//中文
		System.out.println(b3);//
		double d2 = 1e200;
		float f2 = (float) d2;//
		System.out.println(f2);
		
		float f3 = 1.23f;//
		long g1 =123;
		long g2 = 300000000000L;//
		float f = l1 + l2 +f3;//
		long l = (long) f;//
	}
}


