package Day9;

public class UpperCase1 {

	public static void main(String[] args) {

		String s = "Welcome To Pune";
		int count = 0;
		char c1 [] = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1==true);
			count++;
		}
		System.out.println("no of upper case is"+ count);
		
		
		
		
		
		
		
		
	}

}
