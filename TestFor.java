import java.util.*;

public class TestFor {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for(int i : a) {
			System.out.println(i);
		}
		
		Collection c = new ArrayList();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		for(Object o : c) {
			System.out.println(o);
		}
	}
}