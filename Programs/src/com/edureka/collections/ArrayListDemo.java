package com.edureka.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListDemo {
	static void duplicate(String str){
		HashMap<Character, Integer> nameHash = new HashMap<Character, Integer>();
		char [] nameChar = str.toCharArray(); // converting string to char array
		for (char c : nameChar) {
			if(nameHash.containsKey(c)){
				nameHash.put(c, nameHash.get(c)+1); // increments 
			}else{
				nameHash.put(c, 1);
			}
		}
		
		Set <Character> duplicateChar = nameHash.keySet();
		System.out.println("Duplicate of "+str);
		for (Character character : duplicateChar) {
			if(nameHash.get(character)>1){
				System.out.println(character+" "+nameHash.get(character));
			}
		}
	}

	public static void main(String[] args) {
//		Map <Integer, String>namesHashMap = new LinkedHashMap<Integer, String>();
//		namesHashMap.put(3, "Vamshi");
//		namesHashMap.put(1, "Mahesh");
//		namesHashMap.put(2, "Pawan");
//		namesHashMap.put(5, "NTR");
//		namesHashMap.put(4, "Prabas");
//		namesHashMap.put(4, "Teja");
//		System.out.println(namesHashMap);
//		
//		Map <Integer, String>namesMap = new HashMap<Integer, String>();
//		namesMap.put(1, "Vamshi");
//		namesMap.put(2, "Mahesh");
//		namesMap.put(3, "Pawan");
//		namesMap.put(5, "NTR");
//		namesMap.put(4, "Prabas");
//		namesMap.put(4, "Teja");
//		System.out.println(namesMap);
		
		duplicate("vamshirajarikam");
		
		

	}

}
