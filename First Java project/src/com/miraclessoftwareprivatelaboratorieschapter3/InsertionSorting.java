package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Insertion Sorting for any number
public class InsertionSorting {
	static int counter, length;
	static int []arr;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		length = input.nextInt();
		int [] arr = new int[length];
		for(counter=0;counter<length;counter++) {
			System.out.println("Enter the number"+counter);
			arr[counter]= input.nextInt();
		}
		input.close();
		insertSorting(arr);
	
		for(counter=0;counter<length;counter++) {
			System.out.print("After sorting value are"+arr[counter]+" ");
			
		}
	}
	private static int[] insertSorting(int[] arr3
			) {
		for(int counter=0;counter<=length;counter++) {
			int key = arr[counter];
			int temp=counter-1;
			while((temp>0)&&(key<arr[temp])) {
				arr[temp+1]=arr[temp];
				temp--;
			}
			arr[temp+1]=key;	
		}
		return arr;
		
	}
	public int[] go() {
		int []arr= {1,2,3};
		return arr;
		
	}
}
