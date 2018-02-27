package com.edureka.threads;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread runInst = new MyThread();
		Thread one = new Thread(runInst); //Thread(runInst, "one")
		Thread two = new Thread(runInst);
		Thread three = new Thread(runInst);
		one.setName("Vamshi"); 
		two.setName("Divya");
		three.setName("Shravya");
		one.start();
		two.start();
		three.start();
	}

}
