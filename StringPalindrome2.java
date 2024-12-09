package Day7;

public class StringPalindrome2 {

	public static void main(String[] args) {

		String s = "pune is city";
		
		String rev = "";
		
		for( int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println("rev of the string:"+ rev);
		if(rev.equals(s)) {
			System.out.println("String is palindrome");
		}
		else {
		System.out.println("String is not a palindrome");
		}
		
		
		
		
	}

}
