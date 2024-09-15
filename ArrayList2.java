package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();
			l1.add(23);
		l1.add(34);
		l1.add(89);
		l1.add(89);
		l1.add("tree");
		l1.add("rest");
		
	//	System.out.println(l1);
Iterator it = l1.listIterator();		
		
		while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	}
}
