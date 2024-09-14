package Day8;

public class String2 {

	public static void main(String[] args) {

		String s = "pune is no1";
		char p [] = s.toCharArray(); // to break strings into characters
		int countalp =0;
		for ( int i=0; i<s.length(); i++) {
			boolean b1 = Character.isAlphabetic(p[i]);
			if (b1 == true) {
				countalp++;
			}
		}
		System.out.println(countalp);
		
	}

}
