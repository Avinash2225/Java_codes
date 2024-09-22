package day6;

public class String1 {

	public static void main(String[] args) {

		String s = "pune is no1 city";
		char a[] = s.toCharArray();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
		if(Character.isAlphabetic(a[i])) {
			count++;
		}
			
		}
		System.out.println("count of the alphabet is:" + count);
		
		
		
		
		
		
		
		
		
	}

}
