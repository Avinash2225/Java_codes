package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> student = new ArrayList<String>();
		student.add("Avinash");
		student.add("Shred");
		student.add("tom");
		student.add("rest");
		student.add("Avi");
		student.add("roast ");
		//System.out.println(student);
		
		Iterator<String> it = student.listIterator();		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			}
}
