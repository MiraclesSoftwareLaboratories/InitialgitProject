package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Implementing all Condition Statement
public class AllCondition {
	public static void main(String[] args) {
		System.out.println("\t\tHello");
		System.out.println("******************************");
		System.out.println("\t\tWelcome");
		//int append = 0;
		//situation(append);
		situation2();
		}
	public static void situation(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 'T' or 't' for Triangle,'S' or 's' for Square, 'R' or 'r' for Rectangle");
		String condition = sc.next();
		switch(condition) {
		case "t":
		case "T":   System.out.println("Please enter the Height of the Triangle");
					float height = sc.nextFloat();
				  	System.out.println("Please enter the Base of the Triangle");
				  	float base = sc.nextInt();
				  	double result = (0.5)*height*base;
				  	System.out.println(result);
				  	break;
		case "r":
		case "R":   System.out.println("Please enter the Length of the Rectangle");
		   			float length = sc.nextFloat();
		   			System.out.println("Please enter Breadth of the Rectangle");
		   			float breadth = sc.nextFloat();
		   			result = (length*breadth);
		   			System.out.println(result);
		   			break;
		case "s":
		case "S":   System.out.println("Please enter the side of the Square");
		  			float side = sc.nextFloat();
		  			result = (side*side);
		  			System.out.println(result);
		  			break;
		 
				   }
		sc.close();
	}
	public static void situation2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Program for comparision of two numbers");
		System.out.println("Please enter the first number");
		double number1 = input.nextFloat();
		System.out.println("Please enter the Second number");
		double number2 = input.nextFloat();
		if(number1>number2) {
			System.out.println("Number 1 is greater then number 2");
		}
		else
			System.out.println("Number 2 is greater then number 1");
		input.close();
	}
}
