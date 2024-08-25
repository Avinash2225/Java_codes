package Day18;

public class StringSpaces {
	
	static int  count_of_the_alphabet= 0;
	static int  count_of_the_numeric= 0;
	static int  count_of_the_space= 0;


	public static void main(String[] args) {

		String input = "kv no in the pune city 144545454587";
		char [] c2= input.toCharArray();
		 
		
	System.out.println("priting the count of the alphabet");
	for(int i=0; i<input.length(); i++) {
		boolean answer = Character.isAlphabetic(c2[i]);
		// System.out.println(b3);
	
	if ( answer==true) {
		count_of_the_alphabet++;
	}	
		
	}	
System.out.println("The total count is->" +count_of_the_alphabet);


System.out.println("count of the numeric");

	for(int i=0; i<input.length(); i++) {
		boolean b1 = Character.isDigit(c2[i]);
		if(b1==true) {
			count_of_the_numeric++;
		}
	}
	System.out.println("The total count is->" +count_of_the_numeric);

	System.out.println("count of the Space");
	for(int i=0; i<input.length(); i++) {
		boolean b3 = Character.isSpaceChar(c2[i]);
		if(b3==true) {
			count_of_the_space++;
		}
	
	}
	System.out.println("The total count is->" +			count_of_the_space);

	
	
	}
}








