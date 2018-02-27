package com.edureka.module3.sample;

class baseClass2{
	int x=230;
	baseClass2(){
		System.out.println("In the base class");
	}
	public void display(){
		System.out.println("In the base class display");
	}
}
public class derivedClass_RuntimePolymorphism extends baseClass2 {
	derivedClass_RuntimePolymorphism(){
		System.out.println("In the derived class...");
	}
	public void display(){
		System.out.println("In the derived class Display function...");
	}

	public static void main(String[] args) {
		baseClass2 d1= new derivedClass_RuntimePolymorphism();
		d1.display();
	}
}
