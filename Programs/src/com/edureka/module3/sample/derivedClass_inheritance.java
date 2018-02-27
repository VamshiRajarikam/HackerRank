package com.edureka.module3.sample;

class baseClass1{
	int x=220;
	baseClass1(){System.out.println("In the base class");}
	public void displayX(){
		System.out.println("Value of x: "+x);
	}
}


public class derivedClass_inheritance extends baseClass1{

	public static void main(String[] args) {
		derivedClass_inheritance d1= new derivedClass_inheritance();
		d1.displayX();
		System.out.println("In main method");
	}
}
