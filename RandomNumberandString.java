package javatrickyquestions;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
public class RandomNumberandString {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
// Approach 1
		
		Random ran = new Random();
		int ranint = ran.nextInt(1002);
		//System.out.println(ranint);
	
		double randouble = ran.nextDouble();
		
		//System.out.println(randouble);
		
		System.out.println(Math.random());
		
		// Approach 3 Apache coomans -lang API
		
		String s = 	RandomStringUtils.randomNumeric(5);
		
//System.out.println(s);

String s2 = RandomStringUtils.randomAlphanumeric(5);
System.out.println(s2);
	}

}
