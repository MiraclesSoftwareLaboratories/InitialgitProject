package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Condition Class	
public class Condition {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println("Please enter the number which you want to check is it even or odd");
		double integer = variable.nextFloat();
		if(integer%2 == 0) {
			System.out.println("Number is even");
		}
		else
			System.out.println("Number is odd");
		variable.close();
	}

}
