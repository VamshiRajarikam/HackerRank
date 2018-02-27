package com.edureka.module3.sample;

class baseClass{
	int x=220;
	int a=2222;
	public void displayX(){
		System.out.println("Value of x: "+x);
	}
	
}
public class derivedClass extends baseClass{

	public static void main(String[] args) {
		derivedClass d1= new derivedClass();
		baseClass x=new baseClass();
		d1.displayX();
		//System.out.println(a); // can be used if the variable is static which means static value can be called without creating the object
		System.out.println(x.a);
	}

}
