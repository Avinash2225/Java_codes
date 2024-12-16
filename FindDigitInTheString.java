package Day8;

public class FindDigitInTheString {

	public static void main(String[] args) {

		String s3 = " pune is 7734km";
		char [] c3 = s3.toCharArray();
		int countofdigit =0 ;
		for(int i=0; i<s3.length(); i++) {
			boolean b3 = Character.isDigit(c3[i]);
			if(b3==true) {
				countofdigit++;
			}
		}
		System.out.println("count of the digit is :"+ countofdigit);
		
		}

}
