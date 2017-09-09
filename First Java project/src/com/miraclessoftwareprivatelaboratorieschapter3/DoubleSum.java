package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

public class DoubleSum {
	public static void main(String[] args) {
		int num1,num2;
		double result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Addition Program");
		System.out.println("Please enter the first Input");
		num1=input.nextInt();
		System.out.println("Please enter the Second Input");
		num2=input.nextInt();
		input.close();
		if(num1==num2)
				result=((num1+num2)*2);
		else 
			result=num1+num2;
		System.out.println("The result for different inputs is "+result);
		input.close();	
		}
}


