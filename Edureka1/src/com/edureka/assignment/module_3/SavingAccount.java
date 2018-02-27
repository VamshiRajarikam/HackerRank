package com.edureka.assignment.module_3;

public class SavingAccount extends Account {
	private double balance;
	private double last_transaction;
	private static  int minibalance=25;
	private int interest=4;
	private double amount;
	
	//Getters and setters 
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
		SavingAccount.minibalance = minibalance;
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
	
	

}
