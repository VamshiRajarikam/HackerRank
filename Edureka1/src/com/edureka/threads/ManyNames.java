package com.edureka.threads;

class NameRunnable implements Runnable{
	public void run(){
		for(int x=1; x<=3; x++){
			System.out.println("Run by "+ Thread.currentThread().getName()+" , x is "+ x);
		}
	}
}
class NameRunnable2 extends Thread{
	public void run(){
		for(int i=1; i<=3; i++){
			System.out.println("Run by "+ Thread.currentThread().getName()+" , x is"+i );
		}
	}
}
public class ManyNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRunnable nr= new NameRunnable();
		Thread one= new Thread(nr);
		Thread two= new Thread(nr);
		Thread three= new Thread(nr);
		Thread four= new NameRunnable2();
		Thread five= new NameRunnable2();
		Thread six= new NameRunnable2();
		one.setName("Vamshi");
		two.setName("Divya");
		three.setName("Shravya");
		four.setName("Jhansi");
		five.setName("Jyothi");
		six.setName("Jyothsna");
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
		six.start();
	}

}
