package Day30;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSet2 {

	public static void main(String[] args) {

	LinkedHashSet n1	= new LinkedHashSet();
		n1.add(23);
		n1.add(23);
		n1.add("rest");
		n1.add("forest");
		n1.add(null);
		n1.add(null);
		System.out.println(n1);
		Iterator g1 = n1.iterator();
		while(g1.hasNext()) {
			System.out.println(g1.next());
			System.out.println(n1.size());

			
		}

		
		
		
	}

}
