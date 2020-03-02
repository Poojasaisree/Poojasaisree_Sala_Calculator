package com.epam.calculator;

import java.util.Scanner;

public class Input {

	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while(flag == 1) {
			System.out.println("Enter the numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Enter your choice 1.Add 2.Subtract 3.Multiply  4.Divide 5.Modulo 6.Exit");
			int choice = sc.nextInt();
			Operations op = new Operations();
			switch(choice) {
			case 1:
				System.out.println("Result : " + op.addition(num1, num2));
				break;
			case 2:
				System.out.println("Result : " + op.subtraction(num1, num2));
				break;
			case 3:
				System.out.println("Result : " + op.multiplication(num1, num2));
				break;
			case 4:
				System.out.println("Result : " + op.division(num1, num2));
				break;
			case 5:
				System.out.println("Result : " + op.modulo(num1, num2));
				break;
			case 6:
				flag = 0;
				break;
			default:
				System.out.println("Enter the valid input");
				break;
			}

		}

	}

}
