package com.edureka.module3.sample;

abstract class abstract1{
	abstract void test();
}


public class abstract_demo extends abstract1 {
	void test(){System.out.println("in the test");}
	public static void main(String[] args) {
		abstract_demo a= new abstract_demo();
		System.out.println("before create");
		a.test();
		System.out.println("Create");
	}

}
