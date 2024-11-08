package day4;

public class ReverseString1 {

	public static void main(String[] args) {

		String s = "madam";
		String rev = "";
	//int s1 = s;	
		
		// Checking String is Reverse or not 
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
System.out.println("Reverse of the String is:" + rev);
		
		// Checking String is palindrome
		if(s.equals(rev)) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
		
		
		
	}

}
