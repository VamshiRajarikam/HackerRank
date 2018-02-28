package com.algorithms.leetcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String timeConversion(String s) {
		String hh = null,mm,ss,aa;
		String[] parts = s.split(":");
		String part1= parts[0];
		mm= parts[1];
		String part3= parts[2];
		ss=part3.substring(0, 1);
		aa=part3.substring(2,3);
		int result = Integer.parseInt(part1);
		if(aa=="PM"){
			result=result+12;
			if(result==24){
				hh="00";
				aa="AM";
			}else{
				hh=Integer.toString(result);
				aa="PM";
			}
		}
		//String p1 = Integer.toString(result);
		//part3.split("", 2);
		
		String fin= hh+":"+mm+":"+ss+aa;
		return fin;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}