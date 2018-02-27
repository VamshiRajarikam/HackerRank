package com.edureka.module4.sample.test;

import java.util.Scanner;

import com.edureka.module4.sample.queue_inteface;

public class queue_class implements queue_inteface
{
	int queue_array[] = new int[20];
	int first = 0;
	int last = 0;
	

public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 4 numbers to insert into the queue..");
		int x = sc.nextInt();
		queue_class q1 = new queue_class();
		for(int i=0;i<3;i++){
			q1.insert (x);
			x = sc.nextInt();
		}
		System.out.println("Queue elements are ");
		q1.display();
		System.out.println("Deleting 2 elements from queue..");
		int y = q1.delete();
		System.out.println("Deleted element is "+y);
		y = q1.delete();
		System.out.println("Deleted element is "+y);
		System.out.println("Queue Contains..");
		q1.display();	
		}

	@Override
	public void insert(int x) {
		queue_array[last++] = x;	
	}

	@Override
	public int delete() {
		return queue_array[first++];
	}
	
	public void display()
	{
		for (int i = first; i < last; ++i)
			System.out.println(queue_array[i]);
	}

}