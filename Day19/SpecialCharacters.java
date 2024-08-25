package Day19;

public class SpecialCharacters {

	//static int count_of_the_Special_characters =0;
	public static void main(String[] args) {

		String input = "Avi@##$44 nash@#";
		 int totallength = input.length();
		 int count_of_the_alphabet =0;
		 int count_of_the_numeric =0;
		 int count_of_the_Spaces =0;
	       
		System.out.println("Count of the special characters");
		for( int i=0; i<input.length(); i++) {
           char ch = input.charAt(i);
           if(Character.isAlphabetic(ch)) {
        	   count_of_the_alphabet++;
        	   
           }else if(Character.isDigit(ch)) {
        	   count_of_the_numeric++;
           } else if(Character.isSpaceChar(ch)) {
        	   count_of_the_Spaces++;
           }
		}	
	int countoftheSpecialcharacters = totallength-(count_of_the_alphabet+count_of_the_numeric+count_of_the_Spaces); 
	
	System.out.println("total length of the string :" + totallength );
	System.out.println("count of the alphabet :" + count_of_the_alphabet );
	System.out.println("count of the numeric :" + count_of_the_numeric );
	System.out.println("count of the spaces :" + count_of_the_Spaces );
	System.out.println("count of the special charcters :" + countoftheSpecialcharacters );
}
}