package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.io.FileNotFoundException;

//Practicing Exception
public class ThrowAbleException {
	public static void main(String[] args) {
		try {
			float num1,num2;
			float result;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please Enter the first number");
			num1=scan.nextFloat();
			System.out.println("Please Enter the Second number");
			num2=scan.nextFloat();
			scan.close();
			if((num1!=0)&&(num2!=0)) {
				result=num1+num2;
				System.out.println(result);
			}
			else {
				throw new ArithmeticException();
			}
			throw new FileNotFoundException();
		}
		catch(ArithmeticException exc) {
			System.out.println("Any of the given two numbers is 0");
		}
		catch(FileNotFoundException exc) {
			System.out.println(exc);
		}
	
	}

}
