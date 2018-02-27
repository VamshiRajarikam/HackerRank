package com.edureka.module3.sample;

public class final_demo {
	final int x = 20; // cannot change the variable value
	final void testFunction(){ // cannot change the method
		System.out.println("In the final method...");
	}
	public static void main(String[] args) {
		final_demo f1 = new final_demo();
		f1.testFunction();
	}
}
