package trickystringquestions;

public class ReverseEachWordInString {

	public static void main(String[] args) {

	String s = "Today is Monday";
	String [] word = s.split(" ");
		String reverseString = "";
		
		for(String w: word) { // welcome
			String reverseword = "";
			for(int i= w.length()-1; i>=0; i--) {
				reverseword = reverseword + w.charAt(i);
				
			}
			reverseString = reverseString + reverseword+ " ";
		}
System.out.println(reverseString);
	}

}
