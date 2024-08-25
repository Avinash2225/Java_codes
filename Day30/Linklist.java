package Day30;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {


		LinkedList l1 = new LinkedList();
		
		l1.add(34);
		l1.add(34);
		l1.add("tree");
		l1.add("rion");
		l1.add("name");
		l1.addAll(l1);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			System.out.println(l1.size());

			
		}
		
		
		
	}

}
