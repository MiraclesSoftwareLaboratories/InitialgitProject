package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Biggest Comparison Of Conditions	
public class ConditionforComparision {
	public static void comparison() {
		Scanner var = new Scanner(System.in);
		System.out.println("Welcome to the program for Comparison");
		System.out.println("For integer comparison you have to enter 'i' or 'I'"+"\nFor Character comparison you have to enter 'c' or 'C'");
		String condition = var.next();
		switch(condition) {
		case "c":
		case "C":
				System.out.println("*********Now you entered in the Program for Character comparison*********");
				System.out.println("Please enter the character to check weather it is Upper Case or Lower Case");
				char character1 = var.next().charAt(0);
				if(character1>='A'&&character1<='Z'){
					System.out.println("It is an Upper Case Character");
				}
				else
					System.out.println("It is a Lower Case Character");
				System.out.println("Do you want to compare Character please press 'Y' or 'y' for yes and 'n' or 'N' for No");
				character1=var.next().charAt(0);
				if(character1=='Y'||character1=='y') {
					System.out.println("Please enter first character");
					char cha1=var.next().charAt(0);
					System.out.println("Please enter the Second character");
					char cha2=var.next().charAt(0);
					if(cha1>cha2) {
						System.out.println("The character "+cha1+" is greater then character "+cha2);
					}
					else
						System.out.println("The character "+cha2+" is greater then character "+cha1);
				}
				else
					System.out.println("You entered No "+character1);
				break;
		case "i":
		case "I":
				System.out.println("********Now you entered in the Program for integer comparison******");
				System.out.println("Please enterd a number");
				double integer = var.nextDouble();
				System.out.println("You entered "+integer);
				System.out.println("You entered an integer value");
				System.out.println("Do you want to check wheather the entered number is Even or Odd"+"So please enter 'Y for yes");
				char character2 = var.next().charAt(0);
				if(character2=='Y'||character2=='y') {
					if(integer%2==0) {
						System.out.println("You entered an even integer");
					}
					else
						System.out.println("You enetered an odd integer");
				}
				else
					System.out.println("You entered other then 'Y' or 'y'");
				break;
		default :
				System.out.println("You entered a input which is not an character nor an integer");
				break;
				}
	
		var.close();
	}

}
