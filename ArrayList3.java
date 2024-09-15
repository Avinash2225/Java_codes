package ArrayList;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();
		
		l1.add(67);
		l1.add(90);
		l1.add(87);
		l1.add("rest");
		l1.add("evergreen");  // contains method returns boolean

		int r = l1.lastIndexOf(7);
l1.remove(4);
System.out.println(l1);
System.out.println(r);

		System.out.println(l1.contains(777));
		ArrayList l2 = new ArrayList();
		
		l2.add(90);
		l2.add(56);
		l2.add(88);
		l2.add("renust");
		
l2.addAll(l2);	
		System.out.println(l1);
		
		
	}

}
