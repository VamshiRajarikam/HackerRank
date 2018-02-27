package com.edureka.module5;

import java.util.ArrayList;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		List <Integer> a=new ArrayList<Integer>();
		System.out.println("Entered digits are:");
		for(int i=0;i<10;i++){
			a.add(i);
		}
		System.out.println(a);
	}

}
