package Day18;
import java.util.Arrays;

public class String_Function {
	public static void main(String[] args) {

		String input = "kv no 1";
		char [] c1= input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		// in the given string
		// How many are Alphabet letters are present, numeric letter present, spaces present, Special characters present.
		
		for(int i=0; i<input.length(); i++) { //  what is i here
			boolean answer1 = Character.isAlphabetic(c1[i]);
			System.out.println(answer1);
		}
    
		
		
		
		
	}

}
