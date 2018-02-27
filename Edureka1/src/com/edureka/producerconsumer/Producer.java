package com.edureka.producerconsumer;

public class Producer implements Runnable{
	private Resource res;
	public Producer(Resource r){
		res=r;
	}
	
	@Override
	public void run(){
		try{
			res.prod();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
