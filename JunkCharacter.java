package Day1;

public class JunkCharacter {

	public static void main(String[] args) {
String s = "pune is the@#$best@#city";

		System.out.println(s.replaceAll("[^A-z,a-z,0-9^]"," "));
		
	}

}
