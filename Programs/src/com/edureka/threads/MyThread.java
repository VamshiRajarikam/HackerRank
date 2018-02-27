package com.edureka.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am performing task  "+Thread.currentThread().getName());
		System.out.println("Second task performing  "+Thread.currentThread().getName());
		//Wrapper
		int x=256;
		Integer n= new Integer(x);
		System.out.println(n+"  "+Thread.currentThread().getName());
		//int a=in
		
	}
}
