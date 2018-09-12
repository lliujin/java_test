import java.util.*;

public class TestComparable {
	public static void main(String[] args) {
		List l1 = new LinkedList();
		l1.add(new Name("Karl", "M"));
		l1.add(new Name("Steven", "Lee"));
		l1.add(new Name("John", "O"));
		l1.add(new Name("Tom", "M"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
}

class Name {
	private String lastName, firstName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String toString() { return firstName + " " + lastName; }
	
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
	
	public int compareTo(Object o) {			//before the version 1.4
		Name n = (Name)o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));	
	}
}