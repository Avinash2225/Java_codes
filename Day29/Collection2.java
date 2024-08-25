package Day29;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
      Collection t1 = new ArrayList();  // collection hace interface so it will only have abstract method
      t1.add("age");
      t1.add("colore");

      t1.add("car");

      t1.add("brand");                // add is the first method in the collection

      t1.add("size");
  System.out.println(t1);
  Collection t2 = new ArrayList();
  t2.addAll(t1);                    // all elements in the single flow
  t2.add("rice");
  t2.add("flour");
 System.out.println(t2);
  
 boolean b1 = t2.equals(t1);        // method which is starting from is return type is boolean
 //t2.equals(t1); 
 System.out.println(b1);

 boolean b2 = t2.clear(t1);
 
 
 
 
 
 
 
 
 
	}

}
