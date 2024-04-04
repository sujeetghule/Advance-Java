package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creations.User;

public class UserMain {
	public static void main(String[] args) {
		
		User user = User.getObject();
		System.out.println(user);
		
		User u1 = User.getObject();
		System.out.println(u1);
		
		User u2 = User.getObject();
		System.out.println(u2);
		
		User u3 = User.getObject();
		System.out.println(u3);
		
	}

}
