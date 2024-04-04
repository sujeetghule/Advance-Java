package com.jspider.demo.factoryDP;

import java.util.Scanner;

public class QspidersMain {

	
	public static void main(String[] args) {
			
		QspidersMain.taeches().subjects();
		
		
	}
	
	public static Qspider taeches() {
		Qspider qspider = null;
		
		System.out.println("Enter the no For Subject \n1.Java\n2.PyThon\n3.WebTech ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			qspider = new Java();
			break;
		case 2:
			qspider = new Java();
			break;
		case 3:
			qspider = new Java();
			break;

		default:
			System.out.println("You are not elidible for Qspiders");
			break;
		}
		
		return qspider;
		
		
	}
}
