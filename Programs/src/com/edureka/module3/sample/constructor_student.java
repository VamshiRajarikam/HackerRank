package com.edureka.module3.sample;

public class constructor_student {
	int reg_no;
	String name;
	String stream;
	//constructor
	constructor_student() {
		//super();
		reg_no = 0;
		name = "";
		stream = "";
		System.out.println("In the constructor of student:");
	}


	public static void main(String[] args) {
		
		constructor_student student_1= new constructor_student();
		System.out.println(student_1.reg_no);
	}
	
}
