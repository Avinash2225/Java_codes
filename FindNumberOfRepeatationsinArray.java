package ImportantArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfRepeatationsinArray {
         
	public static void Countoccurarray(int [] number) {

		//int num [] = {2,1,3,4,3,1,2,4,5};

		Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();

		for(int num1:number ) {
			if(m2.containsKey(num1)) {
				m2.put(num1,  m2.get(num1)+1);
			}else {
					m2.put(num1, 1);
				}
			}
	
			System.out.println("number of repeatations");	
for(Map.Entry<Integer, Integer> entry  : m2.entrySet()) {
	System.out.println(" numbers " + entry.getKey() + " repeatations " + entry.getValue() + " times ");
}
		}
		public static void main(String[] args) {

int [] number = {1,2,34,1,3,3,2,5,2,4};

Countoccurarray(number);
		
	}

}
