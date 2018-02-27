package com.edureka.social.media;

public class BankAccount {
	private int account_no;
	private int user_id;
	private int routing_no;
	private String name;
	private String address;
	private int SSN;
	
	//Getters and Setters
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRouting_no() {
		return routing_no;
	}
	public void setRouting_no(int routing_no) {
		this.routing_no = routing_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	//Constructors
	public BankAccount(){
		
	}
	public BankAccount(String name, String address) {
		this();
		this.name = name;
		this.address = address;
	}
	
	public BankAccount(int account_no, int routing_no, int sSN) {
		this();
		this.account_no = account_no;
		this.routing_no = routing_no;
		SSN = sSN;
	}
	public BankAccount(int account_no, int user_id, int routing_no, String name, String address, int sSN) {
		this();
		this.account_no = account_no;
		this.user_id = user_id;
		this.routing_no = routing_no;
		this.name = name;
		this.address = address;
		SSN = sSN;
	}
	
	

}
