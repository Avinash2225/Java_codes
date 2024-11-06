package Day6;

public class SubString1 {

	public static void main(String[] args) {
		//String s = "Puneisthecity";
		String s = "radarw";

		//System.out.println(s.substring(4, 8))	;	
		String rev ="";
		//String org 
		
		for(int i= s.length()-1; i>=0; i--) {
		rev =  rev + s.charAt(i);
		}
		System.out.println("Reverse of the string is:" + rev);
		
		if( s.equals(rev)) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
				
	}

}
