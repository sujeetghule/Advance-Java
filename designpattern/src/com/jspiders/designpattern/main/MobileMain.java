package com.jspiders.designpattern.main;

import java.util.Scanner;

import com.jspiders.designpattern.creations.Apple;
import com.jspiders.designpattern.creations.Mobile;
import com.jspiders.designpattern.creations.Realme;
import com.jspiders.designpattern.creations.Redmi;
import com.jspiders.designpattern.creations.Samsung;

public class MobileMain {

	public static void main(String[] args) {
		System.out.println("Enter 1 to Order Apple\n" + "Enter 2 to Order Samsung\n" + "Enter 3 to Order RedMI\n"
				+ "Enetr 4 to Order RealMe\n" + "Enter Your Choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		try {
			MobileFactory(choice).order();
		} catch (Exception e) {
			System.out.println("Your Order is Not Placed For Mobile");
		}

	}

	private static Mobile MobileFactory(int choice) {

		Mobile mobile = null;
		switch (choice) {
		case 1:
			mobile = new Apple();
			break;

		case 2:
			mobile = new Samsung();
			break;
		case 3:
			mobile = new Redmi();
			break;
		case 4:
			mobile = new Realme();
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		return mobile;
	}
}
