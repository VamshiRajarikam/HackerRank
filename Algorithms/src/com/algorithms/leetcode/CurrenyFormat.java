package com.algorithms.leetcode;

import java.util.*;
import java.text.*;

public class CurrenyFormat {

		public static void main(String[] args) throws ParseException {
			Scanner scanner = new Scanner(System.in);
			String payment = scanner.next();
			scanner.close();
			NumberFormat nf = NumberFormat.getInstance(Locale.US);
			String us = nf.format(payment);
			        // Write your code here.

			        System.out.println("US: " + us);
			//System.out.println("India: " + india);
			//System.out.println("China: " + china);
			//System.out.println("France: " + france);
		}
	}

