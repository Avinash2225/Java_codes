package day6;

public class FindNoOfSpaces {

	public static void main(String[] args) {

		String s = "pune is the city1";
		
		char c2[] = s.toCharArray();
		int countofspaces = 0;
		for(int i=0; i<s.length(); i++) {
		boolean b3 =	(Character.isSpaceChar(c2[i]));
		if(b3==true) {
				countofspaces++;
			
		}
		}
		
System.out.println("Number of the spaces present in the string is :" + 	countofspaces );
		}

}
