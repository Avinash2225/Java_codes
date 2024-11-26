package Day9;

public class Strings1 {

	public static void main(String[] args) {

		String s = "pune is no1 city";
		char ch [] = s.toCharArray();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			boolean b1 = Character.isAlphabetic(ch[i]);
			if(b1==true) {
				count++;
			}
		}
		System.out.println("no of alphabetic character is in string is:"+ count);

		
		
	}

}
