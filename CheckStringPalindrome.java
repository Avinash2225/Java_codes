package Day2;

public class CheckStringPalindrome {

	public static void main(String[] args) {
String s1= "MADAM";
String rev   = ""; // here if user provide an space in between then output will change it will show string is not a palindrome
String old = s1;
//String s1 = rev1;
for (int i= s1.length()-1; i>=0; i--) {
	rev = rev + s1.charAt(i);
}
	System.out.println(rev);    // till here we are checking the reverse of the string
		
		if(old.equals(rev) ) {
			
			System.out.println("String is a palindrome");
		}else {
			System.out.println("Strig is not a palindrome");
		}
		
	}

}
