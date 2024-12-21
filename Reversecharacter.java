package Day2;

public class Reversecharacter {

	public static void main(String[] args) {


		String s = "Today is Saturday";
		
		String rev = "";
		
		for( int i=16; i>=0; i--) {
			
			rev=  rev + s.charAt(i);
		
			
		}
		System.out.println("Reverse of the words is" + rev);
		
	}

}
