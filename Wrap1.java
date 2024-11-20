package wrapperclasses;

public class Wrap1 {

	public static void main(String[] args) {

		String x = "100";
		
		//System.out.println(x+20);
		
		// data conversion string to int
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String c = "200";
		
		double d1 = Double.parseDouble(c);
		System.out.println(d1+20);
		
		// String to boolean
		
		String k = "true";
		
		
	boolean b=	Boolean.parseBoolean(k);
	System.out.println(b);
		
	// int to String conversion
	
	int j= 200;
	System.out.println(j+20);
	

	
		
		
	}

}
