package Day8;

public class StringPalindrome112 {

	public static void main(String[] args) {

		String s = "Avinash";
		String rev = "";
		for( int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		
		if(s.equals(rev)) {
			System.out.println("plaindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
	}

}
