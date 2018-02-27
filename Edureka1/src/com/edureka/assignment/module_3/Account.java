package com.edureka.assignment.module_3;

import java.util.Random;
import java.util.Scanner;

import com.edureka.social.media.User;

public class Account {
	protected long account_number;
	protected String name;
	protected String address;
	protected long phone_no;
	protected String account_type;
	
	Account user= new Account();
	public void CreateAccount(){
		System.out.println("Creating an account");
		System.out.println("Enter the name");
		Scanner sc= new Scanner(System.in);
		user.name=sc.nextLine();
		System.out.println("Enter the address");
		user.address=sc.nextLine();
		System.out.println("Enter the phone number");
		user.phone_no=sc.nextLong();
		Random rand= new Random();
		user.account_number=rand.nextInt(1000000000)+2;
		System.out.println(user);
	}
	public void AccountType(){
		System.out.println("Enter the Account type: \n1. Current Account press '1'  \n2. Saving Account press '2'\n");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		if(a==1){
			account_type="Current Account";
			System.out.println("Account type is Current Account");
		}
		else if( a==2){
			account_type="Saving Account";
			System.out.println("Account type is Saving Account");
		}
		else{
			System.out.println("Please re-enter your account type");
			AccountType();
		}
	}
	
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", name=" + name + ", address=" + address + ", phone_no="
				+ phone_no + ", account_type=" + account_type + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
