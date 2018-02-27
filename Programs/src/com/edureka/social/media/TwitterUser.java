package com.edureka.social.media;

public class TwitterUser extends User {
	
	//data
	/*	protected String name;
	protected int age;
	protected String pwd;
	protected String user_id;*/ //parents child relation is established by using "extends". All the properties of parent will be in child
	private String user_id;
	int no_of_tweets;
	
	
	//Constructors
	public TwitterUser() {
		
	}
	public TwitterUser(String name, int age, String user_id, String pwd) {
		this();
		this.name = name;
		this.age = age;
		this.user_id = user_id;
		this.pwd = pwd;
	}
	
	public TwitterUser(String user_id, String pwd) {
		this();
		this.user_id = user_id;
		this.pwd = pwd;
	}
	public TwitterUser(String name) {
		this();
		this.name=name;
	}
	
	
	

	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	
	
	
	
	
	//functionality 
	void doTweet(){
		System.out.println("Tweet !!");
	}
	
	void doRetweet(){
		System.out.println("Retweet !!");
		
	}

	void addPhotos(){
		System.out.println("Adding photos !!");
	}

}
