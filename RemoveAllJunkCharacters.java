package trickystringquestions;

public class RemoveAllJunkCharacters {

	public static void main(String[] args) {

		String s = "Avinash@#$123rest@#";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
