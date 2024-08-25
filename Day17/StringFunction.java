package Day17;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Avinash";
		String b= "   Yadav    ";
		System.out.println(a.trim());		
		System.out.println(b.trim());		

		String c= "pune";
		String d= "Pune"; // false beacause of java is the case sensitive language
		System.out.println(c.equals(d));  // Equals operator in string
	
		// concat is the string functon which is present in all languages including sql also 
		// 
		
		String e= "avinash";
		String f= "Yadav";
		
	System.out.println(e.concat(f));
	
	// equals ignorecase 
	
	System.out.println(e.equalsIgnoreCase(e));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
