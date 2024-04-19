package com.jspider.demo.designPattern.Builder;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact contact = new ContactBuilder().setId(123).setFirstName("sujeet").buildContact();
		
		System.out.println(contact);
	}
}
