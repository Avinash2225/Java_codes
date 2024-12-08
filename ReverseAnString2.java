package day4;

public class ReverseAnString2 {

	public static void main(String[] args) {

		String s = "lucknow";
		
		String rev = "";
		
		for(int i=6; i>=0; i--) {
			rev = rev + s.charAt(i);
			}
System.out.println("reverse of the string is :"+ rev);
}
}
