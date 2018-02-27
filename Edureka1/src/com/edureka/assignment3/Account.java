package com.edureka.assignment3;

abstract class Account {
	 long account_no;
	 String name;
	 double balance=0; // initially we creating the account balance is 0
	 double amount;
	 String account_type;
	 
	public void withdraw(double amount){
		System.out.println("Withdrawing amount is "+amount);
		balance = balance-amount;
		System.out.println("New available balance is "+ balance);
	}
	
	public void deposit(double amount){
		System.out.println("Depositing amount is "+amount);
		balance= balance+amount;
		System.out.println("New available balance is "+ balance);
	}
	
	public void accountDetails(){
		System.out.println("===========================================");
		System.out.println("\tAccount details");
		System.out.println("===========================================");
		System.out.println("\tAccount Number: "+account_no);
		System.out.println("\tName          : "+ name);
		System.out.println("\tAccount Type  : "+ account_type);
		System.out.println("\tAvailable Balance:"+ balance);
	}
		
		
}
