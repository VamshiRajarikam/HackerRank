package com.edureka.assignment.module_3;

import java.util.Scanner;

public class CurrentAccount extends Account {
	private double balance;
	private double last_transaction;
	private static  int minibalance=25;
	private int interest=0;
	private double amount;
	
	
	
	// getters and setters
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getLast_transaction() {
		return last_transaction;
	}
	public void setLast_transaction(double last_transaction) {
		this.last_transaction = last_transaction;
	}
	public static int getMinibalance() {
		return minibalance;
	}
	public static void setMinibalance(int minibalance) {
		CurrentAccount.minibalance = minibalance;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	// Constructors
	public CurrentAccount() {
		
	}	
	
	/*public CurrentAccount(String name) {
		this();
		this.name= name;
	}*/
	
	public CurrentAccount(double balance, double amount) {
		this();
		//this.name= name;
		this.balance = balance;
		this.amount = amount;
	}
	
	public CurrentAccount(String name) {
		this();
		this.name= name;
	}
	
	public CurrentAccount(double balance, double last_transaction, int interest, double amount) {
		super();
		this.balance = balance;
		this.last_transaction = last_transaction;
		this.interest = interest;
		this.amount = amount;
	}
	
	
	
	
	
	// methods
	public void CurrentOptions(){
			System.out.println("Current account selected");
			System.out.println("Press \n1.Deposit \n2. Withdraw \n3. Balance enquiry \n4. Last Transaction");
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			switch(n){
			case 1: Deposit();
					break;
			case 2: Withdraw();
					break;
			case 3: getBalance();
					break;
			case 4: getLast_transaction();
					break;
			default: System.out.println("Enter a valid number");
					CurrentOptions();
			}
		}
	
	public void Withdraw(){
		System.out.println("Enter withdraw amount");
		Scanner sc= new Scanner(System.in);
		amount= sc.nextDouble();
		balance = balance-amount;
		System.out.println("New available balance is :"+balance);//available 
	}
	

	public void Deposit(){
		System.out.println("Enter deposit amount");
		Scanner sc= new Scanner(System.in);
		amount=sc.nextDouble();
		balance= balance+amount;
		System.out.println("New available balance is :"+balance);
	}
	
}
