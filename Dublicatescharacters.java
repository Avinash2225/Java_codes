package trickystringquestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dublicatescharacters {

	public static void main(String[] args) {
		printDublicatecharcters("    ");
		printDublicatecharcters("     ");
		
	}

		public static void printDublicatecharcters(String str)
		{
			if(str== null) {
				System.out.println("Null String");
			return;
			}
		if (str.isEmpty()) {
			System.out.println("empty string");
		return;
		}
		if (str.length() == 1) {
			System.out.println("single char string");
		return;
		}
	
		char words [] = str.toCharArray(); // java
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charmap.containsKey(ch)) {
				
			}else {
				charmap.put(ch, 1);
			}
		}
		
		// print the map
		
		Set<Map.Entry<Character, Integer>> entryset =charmap.entrySet();
		
		for(Map.Entry<Character,Integer> entry :  entryset) {
			if(Entry>1) {
				System.out.println(Entry.getKey() + ": " + Entry.getValue());
			}
		}


