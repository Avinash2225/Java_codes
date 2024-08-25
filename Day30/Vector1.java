package Day30;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {


	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add(23);
		v1.add(67);
		v1.add(23);
		v1.add("river");
		v1.add("rest");
		v1.add(null);
		v1.add(null);
		v1.add(null);
	//	System.out.println(v1);
		Iterator i1 = v1.iterator()	;
		v1.add(23);
		v1.add(67);
		v1.add(23);
		v1.add("river");
		v1.add("rest");
		v1.add(null);
		v1.add(null);
		v1.add(null);
	//	System.out.println(v1);
		Iterator r1 = v1.iterator()	;
		while(r1.hasNext()) {
			//System.out.println(r1.next());
		//	System.out.println(v1.size());
			
			ListIterator l3 = v1.listIterator();
			
			
while(l3.hasNext()) {
	System.out.println(l3.next());
}			
					
while(l3.hasPrevious()) {
	System.out.println(l3.previous());
}
			
		}
		
		
		
	}

}
