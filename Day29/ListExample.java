package Day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List l1 	= new ArrayList();
		
	l1.add(97);
	l1.add(97);
	l1.add(677);
	l1.add(5667);
	l1.add(999);
	l1.add(755);
	l1.add(97);
	l1.add(null);                                // if null is present then it will give exception 
	Collections.sort(l1);
	System.out.println(l1);
	
	
	
	}

}
