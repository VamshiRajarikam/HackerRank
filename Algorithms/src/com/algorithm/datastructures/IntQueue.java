package com.algorithm.datastructures;

public class IntQueue {
	/*
	 * first in first out
	 * 
	 * adding a value is enqueue           ==============
	 * getting a value is dequeue  	 =>5	   5 6 3 8 2 1 4       => 4
	 * 									  ===============
	 *front for adding
	 *rear for getting
	 *
	 */
	private Student [] que;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public IntQueue() {
		size=100;
		total=0;
		front=0;
		rear=0;
		que= new Student[size];
	}
	
	public IntQueue(int size) {
		this.size=size;
		total=0;
		front=0;
		rear=0;
		que= new Student[this.size];
		
	}
	
	public boolean isFull() {
		if(total==size)
			return true;
		else
			return false;
	}
	
	public boolean enqueue(Student item) {
		if(isFull()) {
			return false;
		}else {
			total++;
			que[rear]=item;
			rear= (rear+1)%size;
			return true;
		}
		
	}
	public Student dequeue() {
		Student item =que[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	
	public void showAll() {
		int f=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.println(" "+que[f].toString());
				f=(f+1)%size;
			}
		}
	}
	

}
