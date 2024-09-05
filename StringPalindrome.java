package Day18;

public class StringPalindrome {

	public static void main(String[] args) {

		String s = "MADAM";
		String Output = "";
		for(int i=4; i>=0; i--) {
        char c2 = s.charAt(i);
        
       Output =    Output + c2;
			 
		}
		System.out.println(Output);
		if(s.equals(Output)) {   // for checking output of the string
			System.out.println("string is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
		
	}

}
