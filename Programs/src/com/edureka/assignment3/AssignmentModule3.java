package com.edureka.assignment3;
import com.edureka.assignment3.Account;

import java.util.Random;
import java.util.Scanner;


public class AssignmentModule3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Account type: \n1. Current Account press '1'  \n2. Saving Account press '2'\n");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		Account user;
		if(a==1){
			user= new SavingBankAccount();
			user.account_type="Saving Bank Account";
		}else{
			user=new CurrentAccount();
			user.account_type="Current Account";
		}
		System.out.println("Enter your name:");
		user.name=sc.next();
		System.out.println("Creating...");
		Random ran=new Random();
		user.account_no= ran.nextInt(1000000000) + 1;
		System.out.println("Account number assigned is : "+user.account_no);
		System.out.println("Enter the amount to be deposited");
		user.amount=sc.nextDouble();
		user.deposit(user.amount);
		user.accountDetails();
		//while(true){
		System.out.println("\n\n\nPress 1.Account Details\t\t2.Deposit\t3.Withdraw");
		int s=sc.nextInt();
		switch(s){
		case 1: user.accountDetails();
				break;
		case 2: System.out.println("Enter the amount to be deposited");
				user.amount=sc.nextDouble();
				user.deposit(user.amount);
				break;
		case 3: System.out.println("Enter the amount to withdraw");
				user.amount=sc.nextDouble();
				user.withdraw(user.amount);
				break;
		default: System.out.println("Thank you for banking with us");
				break;
		}
		//System.out.println("Thank you for banking with us");
		}
	}

//}
