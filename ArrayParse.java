public class ArrayParse {
	public static void main(String[] args) {
		String s = "1,2;3,4,5;6,7,8";
		String[] s1 = s.split(";");
		double[][] d = new double[s1.length][];
		for(int i=0; i<s1.length; i++) {
			String[] s2 = s1[i].split(",");
			d[i] = new double[s2.length];
			for(int j=0; j<s2.length; j++) {
				d[i][j] = Double.parseDouble(s2[j]); 
			}
		}
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j] + " ");	//Error model : System.out.print(d[i][j] + ' ');
			}
			System.out.println();
		}
	}
}