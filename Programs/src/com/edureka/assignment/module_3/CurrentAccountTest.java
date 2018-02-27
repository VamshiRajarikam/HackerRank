package com.edureka.assignment.module_3;

import java.util.Scanner;

public class CurrentAccountTest {

	public static void main(String[] args) {
		CurrentAccount vamshi= new CurrentAccount();
		vamshi.CreateAccount();
		vamshi.AccountType();
		if(vamshi.account_type=="Current Account"){
			vamshi.CurrentOptions();
		}
		else{
			
			System.out.println("try");
		}
		
		

	}

}
