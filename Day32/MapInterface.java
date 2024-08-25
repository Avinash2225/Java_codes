package Day32;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer , String> m1 =   new <Integer, String>  HashMap();
		 // methods in map interface
		// 1st method is put
		// do not follow indexing and also order of insertion
		// key and value both are wrapper class 
		// wrapper class means integer, String, 
		// warning message gone
		
		m1.put(23, "suger");
		m1.put(12, "Rice");
		m1.put(21, "Salt");
		m1.put(11, "Sing");
		m1.put(90, "tree");
		m1.put(90, "tree");
		m1.put(90, "tree");
		m1.put(90, "tree");
		System.out.println(m1);
		
	}

}
