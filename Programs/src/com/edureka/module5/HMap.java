package com.edureka.module5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HMap{
	public static void main(String[] args) {
		
		HashMap <String, Double>employee= new HashMap<String, Double>();
		//HMap h1= new HMap(1,"Vamshi", (long)9132239980);
		employee.put("Vamshi", 76000.0);
		employee.put("Divya", 86000.0);
		employee.put("Sweety", 12000.0);
		employee.put("Jhansi", 20000.0);
		employee.put("bhushan", 30000.0);
		
		//Get a set of the entries
		Set<Map.Entry<String, Double>> set= employee.entrySet();
		System.out.println("Enter name and salary");
		
		//Display the set
		for(Map.Entry<String, Double> me:set){
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		//Get a set of the entries
		//Set<Map.Entry<String, Double>> set=employee.entrySet();
		//Display the setv
		System.out.println();
		
		
	}

}
