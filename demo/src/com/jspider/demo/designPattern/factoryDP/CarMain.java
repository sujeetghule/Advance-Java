package com.jspider.demo.designPattern.factoryDP;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {

		Car car1 = CarFActory();
		car1.order();
	}

	public static Car CarFActory() {
		Car car = null;

		System.out.println("Enter the Choice:1.Thar\n2.Audi\n3.XUV");

		Scanner scanner = new Scanner(System.in);

		int value = scanner.nextInt();

		scanner.close();
		switch (value) {
		case 1:
			car = new Thar();
			break;
		case 2:
			car = new Audi();

			break;
		case 3:
			car = new XUV();

			break;

		default:
			break;
		}

		return car;

	}

}
