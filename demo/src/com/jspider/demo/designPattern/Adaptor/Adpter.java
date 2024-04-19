package com.jspider.demo.designPattern.Adaptor;

public class Adpter extends PlayersList implements Team {

	@Override
	public void event() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"is org the event");
	}
	
	public static void main(String[] args) {
		
		Adpter adpter = new Adpter();
		adpter.setName("sujeet");
		
		adpter.event();
		
		
	}
	

}
