package com.edureka.threads;

public class Wrapper {

	public static void main(String[] args) {
		int intValue=78;
		Integer in= new Integer(intValue); //wrapping/boxing an integer using constructor
		System.out.println("Object value"+in);
		int c= in.intValue();		//unboxing /unwrapping
		int x= Integer.valueOf(in); //unboxing using valueOf method
		System.out.println("Int value"+c);
		System.out.println(x);
		int a=10;
		in= Integer.valueOf(a); // boxing using valueOf
		System.out.println(in);

	}

}
