package com.edureka.social.media.test;

public class Outer {
		 class inner{
			public void write(){
				for(int i=0; i<10;i++)
				System.out.println("I am an inner class");
				
			}
		}
	public static void main(String[] args){
	Outer big = new Outer();
	Outer.inner in = big.new inner();
	in.write();
	
}
}