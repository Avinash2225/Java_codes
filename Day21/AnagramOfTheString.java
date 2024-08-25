package Day21;

import java.util.Arrays;

public class AnagramOfTheString {
  public static void main(String[] args) {

		String name = "face";
		String name1 = "cafe";
		if (name.length()!= name1.length()) 
		{
		System.out.println("not an anagram");
		
	}
		else {
			
			char [] c1 = name.toCharArray();
			char [] c2 = name.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
     boolean answer = Arrays.equals(c1, c2);
     System.out.println(answer);
     if(answer==true) {
    	 System.out.println("given strings are anagram");
     }
     else {
    	 System.out.println("given strings are not anagram");
     }
     
   
		}
}
}