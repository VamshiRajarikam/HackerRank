package com.edureka.module3.sample;

public class static_demo {
	static{
		System.out.println("In the static block. . .");
	}

	static int x=30;
	public static void DisplayMessage(){
		System.out.println("In the static function...");
	}
	static{
		System.out.println("In the static block 2. . .");
	}

	public static void main(String[] args) {
		System.out.println("Value of static variable : "+static_demo.x);
		static_demo.DisplayMessage();

	}
	static{
		for(int i=0;i<3;i++)
		System.out.println("In the static block for loop. . .");
	}

}
