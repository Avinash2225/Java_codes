package Day33;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {

		Map <String ,Integer> m1 = new HashMap <String , Integer > ();
		m1.put("avinash", 56);
		m1.put("mobile", 45);
		m1.put("charger", 77);
		m1.put("cable", 58);
		m1.put("Free", 45);
  System.out.println(m1);       // method 1
		//m1.clear();                 // method2 
	//	System.out.println(m1);
boolean b1 = m1.isEmpty();       // method 3
  // System.out.println(b1);

		//boolean b2 = m1.containsKey("ghee"); // method 4
		
	//	System.out.println(b2);
		
 boolean b3 = m1.containsValue(52);     // method 5
//	System.out.println(b3);
	Map <String ,Integer> m2 = new HashMap <String , Integer > ();
	m2.put("avinash", 56);
	m2.put("mobile", 45);
	m2.put("charger", 77);
	m2.put("cable", 58);
	boolean b4= m2.equals(m1);
//	System.out.println(b4);
	if (m1.size()== m2.size()) {
//		System.out.println("size of bot are same");
	}else {
//		System.out.println("size are not same");
		
	}
	
	m1.remove("free");
	System.out.println(m1);
	m1.remove("cable", 45);
	//System.out.println(m1);
m1.replace("avinash", 67);
m1.replace("avinash", 67, 90);
System.out.println(m1);
// System.out.println(m2.replaceAll(m1));

//  m1.keySet()
	}

}
