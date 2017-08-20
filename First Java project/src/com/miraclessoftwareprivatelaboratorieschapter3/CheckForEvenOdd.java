package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Checking the entered number is even or odd
public class CheckForEvenOdd {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int length = keyboard.nextInt();
		double [] arr = new double[length];
		for(int counter=0;counter<length;counter++) {
			System.out.println("Please enter the numbers "+counter);
			arr[counter]=keyboard.nextDouble();
		}
		for(int counter=0;counter<length;counter++) {
			if(arr[counter]%2==0) {
				System.out.println("This is even number "+arr[counter]);
			}
			else
				System.out.println("This is odd number "+arr[counter]);
		}
		keyboard.close();
	}

}
