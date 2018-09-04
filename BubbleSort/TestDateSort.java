public class TestDateSort {
	public static void main(String[] args) {
		Date[] days = new Date[5];
		days[0] = new Date(2006, 5, 4);
		days[1] = new Date(2006, 7, 4);
		days[2] = new Date(2008, 5, 4);
		days[3] = new Date(2004, 5, 9);
		days[4] = new Date(2004, 5, 4);
		
		bubbleSort(days);
		
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
	}
	
	public static Date[] bubbleSort(Date[] d) {
		int len = d.length;
		for(int i=len-1; i>=1; i--) {
			for(int j=0; j<=i-1; j++) {
				if(d[j].compare(d[j+1]) > 0) {
					Date temp = d[j];
					d[j] = d[j+1];
					d[j+1] = temp;
				}
			}
		}
		return d;
	}
}

class Date {
	int year, month, day;
	Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int compare(Date date) {
		return year > date.year ? 1 
			   : year < date.year ? -1
			   : month > date.month ? 1
			   : month < date.month ? -1
			   : day > date.day ? 1
			   : day < date.day ? -1 : 0;
	}
	
	public String toString() {
		return "year:month:day:--" + year + "-" + month + "-" + day; 
	}
}

