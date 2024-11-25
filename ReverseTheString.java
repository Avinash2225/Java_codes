package Day8;

public class ReverseTheString {

	public static void main(String[] args) {

		String s = "madam";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println("reverse of the String:"+  rev);
		
		
		if(s.equals(rev)) {
			System.out.println("String is a plaindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
		
		
		
	}

}
