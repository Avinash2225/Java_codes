package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList5 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "C",  "E" , "T","F"));
      
		l2.removeAll(l3);
	
		System.out.println(l2);
		
		l3.removeAll(l2);
		System.out.println(l3);
		
		
		
		
	}

}
