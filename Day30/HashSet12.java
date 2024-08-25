package Day30;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet12 {

	public static void main(String[] args) {

	HashSet h1	= new HashSet();
	h1.add(23);
	h1.add(23);
	h1.add("aero");
	h1.add("charge");
	h1.add(null);
	h1.add(null);
	h1.add("aero");
	System.out.println(h1);
	
	Iterator g1 = h1.iterator();
	
	while(g1.hasNext()) {
		System.out.println(g1.next());
		
		System.out.println(h1.size());

		
	}

		
		
		
		
	}

}
