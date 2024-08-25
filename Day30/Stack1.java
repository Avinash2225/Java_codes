package Day30;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
      Stack s1 = new  Stack();
      s1.add(45);
      s1.add(48);
      s1.add(88);
      s1.add(88);

      s1.add("her");
      s1.add("Los angeles");
      s1.add(null);
      s1.add(null);
      s1.add(null);
      System.out.println(s1);
		
		Iterator g1 = s1.iterator();
		while(g1.hasNext()) {
			System.out.println(g1.next());
			System.out.println(s1.size());

			
		}
		
		
		
		
		
		
		
	}

}
