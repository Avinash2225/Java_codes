package Day34;

public class StringBuilder12 {

	public static void main(String[] args) {

		
		
		StringBuilder s7 = new StringBuilder("Avinash");
		//s7.append(" Kumar Yadav");
		System.out.println(s7.insert(5, "Pune")); // this will insert index 5
		System.out.println(s7.replace(0, 01, "td" ));
		System.out.println(	s7.reverse());
		System.out.println( s7.length());
		System.out.println(s7.charAt(4));
		System.out.println(s7.substring(0, 5)); // 5 means it will take less than 1 for ending index end index-1
		
		System.out.println(s7);
		System.out.println(s7.toString());
	   int b= (s7.capacity());
	   System.out.println(b);
	     int a = s7.length();
	     System.out.println(a);
	     
	     
	}

}
