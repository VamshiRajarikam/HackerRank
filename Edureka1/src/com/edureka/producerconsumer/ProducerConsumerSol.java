package com.edureka.producerconsumer;

public class ProducerConsumerSol {

	public static void main(String[] args) {
		Resource r= new Resource();
		Thread prod = new Thread(new Producer(r));
		prod.setName("Producer");
		prod.start();
		Thread cons = new Thread(new Consumer(r));
		cons.setName("Consumer");
		cons.start();
	}

}
