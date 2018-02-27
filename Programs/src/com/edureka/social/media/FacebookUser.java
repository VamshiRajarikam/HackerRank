package com.edureka.social.media;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacebookUser extends User implements Sharable {
	
		//data/properties/state/what class has?
	private int id;
	private Date dob;
	private String job_description;
	private String address;
	static String account_type="Facebook";
	public static int count;
	
	//Collections
	List <FacebookUser> friends;
	
	
	
	
	//Source-> generate constructor using fields 
	//Constructors
	
	public FacebookUser(){
		count=count+1;
	}
	public FacebookUser(String name, int age, Date dob, String user_id, String pwd, String address,
			String job_description) {
		//super();
		this(); // "this" will call the sister constructors. Executes the default constructor. Always "this" should be first line in any constructor.
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.user_id = user_id;
		this.pwd = pwd;
		this.address = address;
		this.job_description = job_description;
	}
	
	public FacebookUser(String name) {
		//super();
		this();
		this.name = name;
	}

	
	
	//Getters and Setters 
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		//logic to filter any gibberish values
		this.address = address;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	//ArrayList getter setter
	public List<FacebookUser> getFriends() {
		return friends;
	}
	public void setFriends(List<FacebookUser> friends) {
		this.friends = friends;
	}

	
	

	
	
	//abstract void addFriends(); //which is not complete and cannot instantiate 
	
	//functionality/behavior/what it does?/Methods
	public void addFriends(){
		System.out.println("Adding a friend\n");
	}
	
	void doPostStatus(){
		System.out.println("Posting status!! ");
	}

	
	void addPhotos(){
		System.out.println("Adding profile !!");
	}
	
	//override a method @Override
	@Override
	public void updateProfile(){
		System.out.println("Update Facebook profile!! ");
	}  
	@Override
	public String toString() {
		return "FacebookUser [dob=" + dob + ", job_description=" + job_description + ", address=" + address + ", name="
				+ name + ", age=" + age + ", pwd=" + pwd + ", user_id=" + user_id + "]";
	}
	@Override
	public void share() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((job_description == null) ? 0 : job_description.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacebookUser other = (FacebookUser) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (job_description == null) {
			if (other.job_description != null)
				return false;
		} else if (!job_description.equals(other.job_description))
			return false;
		return true;
	}
	
	



}
