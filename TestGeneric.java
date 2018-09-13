import java.util.*;

public class TestGeneric {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		for(int i=0; i<l.size(); i++) {
			String s = l.get(i);
			System.out.println(s);
		}
		
		Collection<String> c = new HashSet<String>();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		for(Iterator<String> i = c.iterator(); i.hasNext();) {
			String s = i.next();
			System.out.println(s);
		}
	}
}

class MyName implements Comparable<MyName> {
	int age;
	
	public int compareTo(MyName mn) {
		if(this.age > mn.age) return 1;
		else if(this.age < mn.age) return -1;
		else return 0;
	}
}