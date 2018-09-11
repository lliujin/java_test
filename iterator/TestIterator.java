import java.util.*;

public class TestIterator {
	public static void main(String[] main) {
		Collection c = new HashSet();
		c.add(new Name("fff1", "lll1"));
		c.add(new Name("f2", "l2"));
		c.add(new Name("fff3", "lll3"));
		Iterator i = c.iterator();
		while(i.hasNext()) {
			Name n = (Name)i.next();
			System.out.print(n.getFirstName() + " ");
		}
		
		if(n.getFirstName().length() < 3) {
				i.remove();
			}
			System.out.println(c);
	}
}

class Name {
	private String firstName, lastName;
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String toString() { return lastName + " " + lastName; };
	
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name name = (Name)obj;
			return (firstName.equals(name.firstName))
			    && (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	
	public int hashCode() {
		return firstName.hashCode();
	}
}