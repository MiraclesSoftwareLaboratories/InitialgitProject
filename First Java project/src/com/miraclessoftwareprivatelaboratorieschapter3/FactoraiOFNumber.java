package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Calculate the Factorial of the number
public class FactoraiOFNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number whose factorial is to find");
		int number = keyboard.nextInt();
		long fact=factorial(number);
		System.out.println("The factorial "+number+" is "+fact);
		keyboard.close();
	}
	public static long factorial(int num) {
		if(num==0) {
			return 1;
		}
		else 
			return(num*factorial(num-1));
	}
	
	

}
