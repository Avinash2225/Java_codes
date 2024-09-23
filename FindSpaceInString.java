package Day8;

public class FindSpaceInString {

	public static void main(String[] args) {

		String s1 = "pune is the city";
		char [] c2 = s1.toCharArray();
		int spacecount = 0;
		
		for(int i=0; i<s1.length(); i++) {
			boolean b2 = Character.isSpaceChar(c2[i]);
			if(b2==true) {
				spacecount++;

			}
		}
		System.out.println("no of the space count is:" + spacecount);

		}

}
