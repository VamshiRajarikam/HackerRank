package com.edureka.module4.sample;

public class function_pack {
	public int reverse(int x){
		int rem, rev=0;
		for(;x>0;x=x/10){
			rem=x%10;
			rev=rev*10+rem;
		}
		return rev;
	}
	public long factor(int x){
		int fact=1;
		for(int i = 1 ; i <= x;++i){
			fact=fact*i;
		}
		return fact;
	}
	public int subtract(int x, int y){
		return x-y;
	}
	public int multiplication(int x, int y){
		return x*y;
	}
	public double division(int x,int y){
		return x/y;
	}
}
