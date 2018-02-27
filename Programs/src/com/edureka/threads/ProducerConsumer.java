package com.edureka.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		Resource1 r= new Resource1();
		//Thread producer = new Thread(new Producer1(r));
		//produce.setName("Producer1");
		//produce.start();
		Thread consumer = new Thread(new Consumer1(r));
		consumer.setName("Consumer1");
		consumer.start();

	}
}
	
	class Producer implements Runnable {
		private Resource1 resource;
		public void Producer1(Resource1 r){
			resource = r;
		}
	
		@Override
		public void run(){
			try{
				resource.produce1();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	class Consumer1 implements Runnable{
		private Resource1 resource;
		public Consumer1(Resource1 r){
			resource =r;
		}
		@Override
		public void run(){
			try{
				resource.consume();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	class Resource1{
		public static List<Integer> list = new ArrayList<Integer>();
		public void produce1() throws InterruptedException {
			int value =0;
			while(true){
				synchronized (this){
					while(list.size()==2)
						wait();
					
					//to insert the jobs in the list
					list.add(value++);
					System.out.println("added element size has become: " +list.size());
					
					//notifies the consumer thread that
					//now it can start consuming
					notifyAll();
					
					//makes the working of the program easier to understand
					Thread.sleep(1000);
					
				}
			}
		}
	
	
	//Function called by the consumer thread
	public void consume() throws InterruptedException{
		while(true){
			synchronized(this){
				while(list.size()==0)
					wait();
				// to retrieve the first job in the list
				list.remove(0);
				System.out.println("Removed element size has become : "+ list.size());
				
				//wakeup all producer threads
				notifyAll();
				//and sleep
				Thread.sleep(1000);
			}
		}
	}
	
	//Function called by producer thread
	public void produce() throws InterruptedException{
		int value=0;
		while(true){
			synchronized(this){
				while(list.size()==2)
					wait();
				//to insert job in the list
				list.add(value++);
				
				System.out.println("added element size has become: "+list.size());
				
				//notify all consumer threads it can start consuming
				notifyAll();
				
				//makes the working program easier to understand
				Thread.sleep(1000);
				
				
			}
		}
	}

	}
