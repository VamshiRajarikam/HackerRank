package com.edureka.social.media.test;

import com.edureka.social.media.TwitterUser;

public class TestTwitterUser {

	public static void main(String[] args) {

		TwitterUser vamshi;
		//vamshi.setAge(17); 
		vamshi= new TwitterUser("Vamshi",23,"vamshi5130","thinking");
		System.out.println(vamshi.getAge());
		System.out.println(vamshi.getName());
		vamshi.getAge();
		TwitterUser divya=new TwitterUser("divya");
	}

}
