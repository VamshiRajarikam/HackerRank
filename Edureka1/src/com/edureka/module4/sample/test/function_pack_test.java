package com.edureka.module4.sample.test;

import java.util.Scanner;

import com.edureka.module4.sample.function_pack;

public class function_pack_test {

	public static void main(String[] args) {
		function_pack f1= new function_pack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x= sc.nextInt();
		int y= sc.nextInt();
		System.out.println("Factorial of "+x+"is "+f1.factor(x));
		System.out.println("Reverse of "+x+"is "+f1.reverse(x));
		System.out.println("Subtraction of "+x+" & "+y+"is "+f1.subtract(x, y));
		System.out.println("Multiplication of "+x+" & "+y+"is "+f1.multiplication(x, y));
		System.out.println("Division of "+x+" & "+y+"is "+f1.division(x, y));
		//System.out.println("Factorial of "+x+"is "+f1.factor(x));
	}

}
