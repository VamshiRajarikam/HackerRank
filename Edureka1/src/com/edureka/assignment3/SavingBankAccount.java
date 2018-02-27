package com.edureka.assignment3;

public final class SavingBankAccount extends Account {
	double minimum_balance=10000;
	//Account user1= new SavingBankAccount();
	public void deposit(double amount){
		super.deposit(amount);
	}
	public void withdraw( double amount){
		super.withdraw(amount);
	}
	void interestRate(int months){
		balance = balance+(months*0.04);
	}
}
