package Day31;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {

        Vector v1 = new Vector();		
		
        v1.add(33);
        v1.add(34);
        v1.add(34);
        
        System.out.println("this is vector v1:" + v1);
        
        System.out.println(" iterator");
        Iterator d1 = v1.iterator();
        
        while(d1.hasNext()) {
        	
   	
        	System.out.println(d1.next());

        }
        System.out.println("list of iterator");

        
		ListIterator v4 =      v1.listIterator();
        while(v4.hasNext()) {
        	System.out.println(v4.next());
        	
            System.out.println("list of iterator previous");

        }
        while(v4.hasPrevious()) {
        	System.out.println(v4.previous());
        	
            System.out.println("Enumaration");

        	Enumeration e1 = v1.elements();
        	while(e1.hasMoreElements())
        	{
        		System.out.println(e1.nextElement());
        	}
        }
	}

}
