package Day30;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {

PriorityQueue p1 = new PriorityQueue ();

 
	//	p1.add(null);
		p1.add("Avinash");
		p1.add("Kite");
		p1.add("elephent");
		p1.add(34);
		p1.add(67);
		p1.add(855);
		p1.add(null);
		p1.add(null);
		p1.add(null);

		
		System.out.println(p1);
System.out.println(p1);
		
		Iterator h1 = p1.iterator();
		while(h1.hasNext()) {
			System.out.println(h1.next());
			System.out.println(p1.size());

			
		}
	
	
	
	
	}

}
