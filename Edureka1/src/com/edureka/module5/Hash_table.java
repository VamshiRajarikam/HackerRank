package com.edureka.module5;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hash_table {

	public static void main(String[] args) {
		Double max=0.0;
		String name=null;
		Hashtable<String, Double> marks= new Hashtable<String,Double>();
		marks.put("charan", 76.0);
		marks.put("Kiran", 54.5);
		marks.put("Divya", 66.0);
		marks.put("Pradeep", 56.0);
		marks.put("Raju", 95.0);
		Set<Map.Entry<String, Double>> set= marks.entrySet();
		
		for(Map.Entry<String, Double> me:set){
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		for(Map.Entry<String, Double> me:set){
			Double x=me.getValue();
			
			if(x>max){
				max=x;
				name= me.getKey();
			}
		}
		System.out.println("Name:  "+name+"  Marks: "+max);
		
		
	}

}
