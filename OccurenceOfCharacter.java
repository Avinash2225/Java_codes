package Day7;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {
	public static void getcharcount(String name) {

Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		// test a=2 , v =1 , i =1, n=1, s=1, h=1
		// hashmapmap<k,v> character, integer
		
		char ch  []= name.toCharArray();
		
for (char s1 : ch) {
		if(m1.containsKey(s1)) {
m1.put(s1, m1.get(s1) +1);				
			}else {
				m1.put(s1, 1);
			}
}
System.out.println(name + " : " + m1);

	}
			public static void main(String[] args) {
				getcharcount("avinash");
		
		
		
		
		}
		
		
		

		
		
		
		
	}


