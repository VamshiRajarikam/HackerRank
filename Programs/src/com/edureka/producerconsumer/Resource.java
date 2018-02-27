package com.edureka.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Resource {
	public static List<Integer> list = new ArrayList<Integer>();
	
	//Function called by producer thread
	public void prod() throws InterruptedException{
		int value=0;
		while(true){
			synchronized(this){
				while(list.size()==5)
				wait();
				
				//to insert the jobs in the list
				list.add(value++);
				System.out.println("added elememt size has become:"+ list.size());
				notifyAll();
				Thread.sleep(1000);
			}
		}
	}
	public void cons() throws InterruptedException{
		while(true){
			synchronized (this){
				while(list.size()==0)
					wait();
					list.remove(0);
					System.out.println("Removed element size has become: " +list.size());
					notifyAll();
					Thread.sleep(1000);
			}
		}
		
	}
}
