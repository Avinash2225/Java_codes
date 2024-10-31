package Day9;

public class UpperLowercount {

	public static void main(String[] args) {

		String s= "Welcome To The Pune";
		int uppercount =0;
		int lowercount =0;
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				uppercount++;
			}
			else if (ch>='a'&& ch<='z'){
				lowercount++;
			}
		}
		System.out.println("the count of the upper case is:"+ uppercount);
		
		System.out.println("the count of the lower case is:"+ lowercount);
		
	}

}
