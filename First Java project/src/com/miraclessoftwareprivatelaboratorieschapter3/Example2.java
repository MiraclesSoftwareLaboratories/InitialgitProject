package com.miraclessoftwareprivatelaboratorieschapter3;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
//Checking Different Exception
public class Example2 {
	public static void main(String[] args) {
		try {
			int[]a = new int[7];
			a[4]=10/0;
			System.out.println("First Print Statement in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Warning: It's an Arithmetic Exception");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Warning: It's an ArrayIndexOutOfBoundsException");
		}
		System.out.println("Out of the Try-Catch block");
	}

}
