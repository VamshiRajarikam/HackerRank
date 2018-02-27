package com.edureka.module5;

public class WrapperClass {

	public static void main(String[] args) {
		Byte b=new Byte((byte)23);
		Integer i=new Integer(100);
		Short s=new Short((short)100);
		Long l= new Long(1234567890);
		Character c= new Character('a');
		Float f= new Float(100.1234);
		Double d= new Double(100.12345678);
		Boolean bo =new Boolean(true);
		
		System.out.println("Byte : "+b);
		System.out.println("Integer : "+i);
		System.out.println("Short : "+s);
		System.out.println("Long : "+l);
		System.out.println("Character : "+c);
		System.out.println("Float : "+f);
		System.out.println("Double : "+d);
		System.out.println("Boolean : "+bo);
	}

}
