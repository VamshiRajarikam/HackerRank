package com.edureka.module3.sample;

public class constructor_with_param_student {
	int reg_no;
	String name;
	String stream;
	//constructor
	public constructor_with_param_student(int reg, String name1, String stream1) {
		reg_no = reg;
		name = name1;
		stream = stream1;
		System.out.println("In the constructor with arguments of student..and thr data is "+reg_no+" "+name+" "+stream);
	}
	public static void main(String args[]){
		
		constructor_with_param_student student1= new constructor_with_param_student(10,"Vamshi", "CS");
	}
	
	

}
