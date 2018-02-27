package com.edureka.module4.sample.test;

import java.util.Scanner;

public class ArrayIndexBoundException {

	public static void main(String[] args) {
		try{
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array is out of bounds exception"+e);
		}
		finally{
			System.out.println("Finally");
		}
		
	}

}
