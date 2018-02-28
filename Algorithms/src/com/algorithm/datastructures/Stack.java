package com.algorithm.datastructures;

public class Stack {
	/*
	size					|	 9     |
	top					|	 7	   |   push = 9
	push					|	 4	   |	   pop will be 9 first then 7, 4 ...
	pop					|____2_____|
	
	Maths 
	*/
	private int [] stack;
	private int top;
	private int size;
	public Stack() {
		top= -1;
		size= 50;
		stack = new int [50];
	}
	
	public Stack(int size) {
		top=-1;
		this.size=size;
		stack= new int [this.size];
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
			return true;
		}else {
			return false;
		}
	}
	
	public int pop() {
		return (stack[top--]);
	}
	
	public boolean isFull() {
		return (top==stack.length-1);
	}
	
	public boolean isEmpty() {
		return (top==-1); 
	}

}
