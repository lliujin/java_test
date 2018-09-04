class BirthDate {
	private int day;
	private int mouth;
	private int year;
	
	public BirthDate(int d, int m, int y) {
		day = d;
		mouth = m;
		year = y;
	}
	
	public void setDay(int d) {
		day = d;
	}
	
	public void setMouth(int m) {
		mouth = m;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMouth() {
		return mouth;
	}
	
	public int getYear() {
		return year;
	}
	
	public void display() {
		System.out.println
		(day + "-" + mouth + "-" + year);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Test2 test = new Test2();
		int date = 9;
		BirthDate d1 = new BirthDate(7, 7, 1970);
		BirthDate d2 = new BirthDate(1, 1, 2000);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date=" + date);
		d1.display();
		d2.display();
	}
	
	public void change1(int i) {
		i = 1234;
	}
	
	public void change2(BirthDate b) {
		b = new BirthDate(22, 2 ,2004);
	}
	
	public void change3(BirthDate b) {
		b.setDay(22);
	}
}





