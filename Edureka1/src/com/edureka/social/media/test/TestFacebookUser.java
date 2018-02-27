package com.edureka.social.media.test;

import java.util.*;

import com.edureka.social.media.BankAccount;
import com.edureka.social.media.FacebookUser;
import com.edureka.social.media.User;

public class TestFacebookUser extends BankAccount{

	public static void main(String[] args) {
		
		//create an object of the class
		FacebookUser vamshi;
		
		//How to assign memory location
		vamshi= new FacebookUser("Vamshi"); //constructor function
		
		//vamshi="5409 Harrison St Kansas City MO 64110";
		// vamshi.job_description="Java developer";
		
		vamshi.setAddress("5409 Harrison St Kansas City");
		System.out.println(vamshi.getAge());
		System.out.println(vamshi.getName());
		System.out.println(vamshi.getDob());
		System.out.println(vamshi.getAddress());
		System.out.println(vamshi.count);
	
		FacebookUser shravya = new FacebookUser();
		System.out.println("Count is :"+ shravya.count);
		
		FacebookUser divya = new FacebookUser();
		System.out.println("Count is : "+divya.count);
		
		System.out.println(shravya.toString());
		System.out.println(vamshi.toString());
		shravya.updateProfile();
		System.out.println(divya);
		
		//
		User Prince= new FacebookUser("Prince");
		Prince.updateProfile();
		FacebookUser king;
		king =new FacebookUser();
		List <String> namesList = new ArrayList<>();
		namesList.add("Vamshi");
		namesList.add("Shravya");
		namesList.add("divya");
		namesList.add("Jhansi");
		System.out.println(namesList);
		System.out.println(namesList.size());
		for(String abc: namesList){
			System.out.println("Welcome "+abc);
		}
		namesList.remove(3);
		System.out.println(namesList.size());
		System.out.println(namesList);
		namesList.remove("Shravya");
		System.out.println(namesList);
		
		
		List <FacebookUser> fbusers = new ArrayList<FacebookUser>();
		fbusers.add(shravya);
		fbusers.add(divya);
		vamshi.setFriends(fbusers);
		System.out.println("Vamshi Friends"+vamshi.getFriends());
		
		
		//Hash Set // unordered, unsorted, hashed each value for better performance
		Set <String> namesSet= new HashSet<String>();
		namesSet.add("Mahesh babu");
		namesSet.add("Pawan");
		namesSet.add("NTR");
		namesSet.add("Allu Arjun");
		namesSet.add("Pawan");
		System.out.println(namesSet);
		
		
		//TreeSet // sorted, ordered
		Set <String> namesTree= new TreeSet<String>();
		namesTree.add("Mahesh babu");
		namesTree.add("Pawan");
		namesTree.add("NTR");
		namesTree.add("Allu Arjun");
		namesTree.add("Pawan");
		System.out.println(namesTree);
		
		
		//Queue // natural sorted // Values are prioritized // based on the logic of prioritizing it is sorted// need not be 
		
		Queue <Integer> intQueue = new PriorityQueue<Integer>();
		intQueue.add(3);
		intQueue.add(1);
		intQueue.add(93);
		intQueue.add(30);
		intQueue.add(21);
		intQueue.add(43);
		intQueue.add(33);
		System.out.println(intQueue);
		
		//Maps
		
		// HashMap is unordered // for better performance have better hash code
		Map <Integer, String>namesMap = new HashMap<Integer, String>();
		namesMap.put(1, "Vamshi");
		namesMap.put(2, "Mahesh");
		namesMap.put(3, "Pawan");
		namesMap.put(5, "NTR");
		namesMap.put(4, "Prabas");
		System.out.println(namesMap);
		
		
		//Linked hash map // ordered in
		Map <Integer, String>namesHashMap = new LinkedHashMap<Integer, String>();
		namesHashMap.put(3, "Vamshi");
		namesHashMap.put(1, "Mahesh");
		namesHashMap.put(2, "Pawan");
		namesHashMap.put(5, "NTR");
		namesHashMap.put(4, "Prabas");
		System.out.println(namesHashMap);
		
		
		//Hash table
		Map <Integer, String>namesHashtable = new Hashtable<Integer, String>();
		namesHashtable.put(3, "Vamshi");
		namesHashtable.put(2, "Mahesh");
		namesHashtable.put(1, "Pawan");
		namesHashtable.put(5, "NTR");
		namesHashtable.put(4, "Prabas");
		System.out.println(namesHashtable);
		System.out.println(namesHashtable.size());
		
		
		

	}

}
