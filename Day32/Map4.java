package Day32;

import java.util.HashMap;
import java.util.Map;

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String,Integer  > m6 = new < String,Integer > HashMap();

		m6.put("Rice", 1);

		m6.put("dal", 2);

		m6.put("flour", 3);

		m6.put("masala", 4);

		m6.put("chapati", 5);

		m6.put("cookies", 6);
		System.out.println(m6);
		m6.clear();
		
		System.out.println(m6);
		
		Map <String,Integer  > m7 = new < String,Integer > HashMap();

		m7.put("copy",2);
		
	// size takes how many pairs are present	
		
		boolean b2= m6.containsValue(1);
		System.out.println(b2);
		
      boolean b1 =      m6.containsKey("Rice");
        
		System.out.println(b1);
	 m7.putAll(m6);
	 m7.put("earphone" , 8);
	 System.out.println(m7);
     boolean b7 = m6.equals(m7);
     System.out.println(b7);


			}

		}

		
		
		
		
		
		
		
		
	
