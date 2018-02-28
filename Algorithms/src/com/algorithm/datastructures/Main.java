package com.algorithm.datastructures;

public class Main {

	public static void main(String[] args) {
		
		//int type stack
		Stack intStack = new Stack();
		intStack.push(5);
		intStack.push(6);
		intStack.push(4);
		intStack.push(7);
		intStack.push(2);
		intStack.push(1);
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		
		//Student type Queue
		Student vamshi = new Student("vamshi", "201712", "computer science");
		Student divya = new Student("divya", "201613", "computer science");
		Student shravya = new Student("shravya", "201811", "Medical science");
		IntQueue umkc = new IntQueue();
		umkc.enqueue(vamshi);
		umkc.enqueue(divya);
		umkc.enqueue(shravya);
		
		//System.out.println(umkc.dequeue());
		umkc.showAll();
	}

}
