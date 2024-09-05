package Day19;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {

		int rollno[] = new int[4]; // decleare of the array
		
		int rollno1[] = new int[4];

		rollno[0] = 34;
		rollno[1] = 24;
		rollno[2] = 44;
		
		rollno1[3] = 94;
		rollno1[0] = 34;
		rollno1[1] = 24;
		rollno1[2] = 44;
		rollno1[3] = 94;
boolean b1 = Arrays.equals(rollno, rollno1);
System.out.println(b1);

		
	}

}
