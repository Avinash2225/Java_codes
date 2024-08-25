package Day18;

import java.util.Arrays;

public class String_tocharAt {

	public static void main(String[] args) {
	// String input = "school";
		
		String input = "kv no 1";
		char []  c1= input.toCharArray();  
		
		
		//System.out.println(Arrays.toString(c1));  // converted Avinash into To char array
	
		// any string is the character of the array
		
		// we can not write this in automation instead of this we can write for loop
		
		// How many Alphabet are present
		
		System.out.println("Finding out Alphabet");      //1
		for(int i=0; i<input.length(); i++)
		{
		   	boolean b1 = Character.isAlphabetic(c1[i]);
		  // 	for(int i= 0; i<input.length(); i++)
		    System.out.println(b1);
		  
		}
		
	/*	System.out.println("Finding the Numeric");        // 2
           for(int i=0; i<input.length(); i++)
		{
		   	boolean b1 = Character.isDigit(c1[i]);
		    System.out.println(b1);
		}   */
		
        /*   System.out.println("Finding the Spaces");   // 3
           for(int i=0; i<input.length(); i++)
		{
		   	boolean b1 = Character.isSpace(c1[i]);
		    System.out.println(b1);
		}*/
		
           System.out.println("Finding the Spaces");
           for(int i=0; i<input.length(); i++)
		{
		   	boolean b1 = Character.isSpaceChar(c1[i]);         // depriciated method RIP method if space is cut
		    System.out.println(b1);
		}
           
          	
		/*boolean b1= 	Character.isAlphabetic(c1[0]);
	boolean b2= 	Character.isAlphabetic(c1[1]);
	boolean b3= 	Character.isAlphabetic(c1[2]);
    System.out.println(b1);
	System.out.println(b1);
	System.out.println(b1);
*/
	
	
	
	}

}
