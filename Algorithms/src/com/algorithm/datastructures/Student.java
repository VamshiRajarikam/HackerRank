package com.algorithm.datastructures;

public class Student {
	private String name;
	private String rollno;
	private String course;
	public Student(String name, String rollno, String course) {
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}
	public String toString() {
		return "Name :"+this.name+" Roll No :"+this.rollno+" Course :"+this.course;
	}
	
}
