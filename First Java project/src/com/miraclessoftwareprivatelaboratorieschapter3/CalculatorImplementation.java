package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Calculator implementation
public class CalculatorImplementation {
	public static void inputmethod(int integer) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello Welcome to the Calculator");
		System.out.println("What do you want to do");
		float number1,number2;
		double result;
		System.out.println("Your Entered in Basic calculator");
		System.out.println("Now please enter accordingly");
		System.out.println("Please Enter 'A','a'.'+' for addition");
		System.out.println("Please enter 'S','s','-' for subtraction");
		System.out.println("Please enter 'M','m','*' for multiplication");
		System.out.println("Please enter 'D','d','/' for division");
		String variable = input.next();
		switch(variable) {
				case "A":
				case "a":
				case "+":
						System.out.println("Please enter the first number for addition");
						number1 = input.nextFloat();
						System.out.println("Please enter the Second number for addition");
						number2 = input.nextFloat();
						result = number1+number2;
						System.out.println("The result is "+result);
						break;
				case "S":
				case "s":
				case "-": 
						System.out.println("Please enter the first number for subtraction");
						number1 = input.nextFloat();
						System.out.println("Please enter the second number for subtraction");
						number2 = input.nextFloat();
						result = number1-number2;
						System.out.println("The result is "+result);
						break;
				case "M":
				case "m":
				case "*":
						System.out.println("Please enter the first numbers for multiplication");
						number1 = input.nextFloat();
						System.out.println("Please enter the second number for multiplication");
						number2= input.nextFloat();
						result=number1*number2;
						System.out.println("The result is "+result);
						break;
				case "D":
				case "d":
				case "/":
						System.out.println("Please enter the first number for division");
						number1 = input.nextFloat();
						System.out.println("Please enter the second number for division");
						number2 = input.nextFloat();
						result = number1/number2;
						System.out.println("The result is "+result);
						}
		
		input.close();
	}

}
