package Day30;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List12 {

	public static void main(String[] args) {

		
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(23);
		a1.add(22);
		a1.add(22);
		a1.add("Pune");
		a1.add(223);
		a1.add(null);
		a1.add(null);
		a1.add(null);
         // a1.clear();
		System.out.println(a1.indexOf(0));

		System.out.println(a1);
		System.out.println(a1.contains(2222));
		Iterator i1 =  a1.iterator();
		while(i1.hasNext()) {
		
			System.out.println(i1.next());
			System.out.println(a1.size());
           boolean b1 = a1.contains("avinash")	;
		}
		
	}

}
