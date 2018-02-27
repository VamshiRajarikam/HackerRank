package com.edureka.producerconsumer;

public class Consumer implements Runnable {
	private Resource res;
	public Consumer(Resource r){
		res=r;
	}
	@Override
	public void run() {
		try{
			res.cons();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
