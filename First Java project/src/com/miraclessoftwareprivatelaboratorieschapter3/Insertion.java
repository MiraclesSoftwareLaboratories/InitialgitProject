package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Insertion Sorting
public class Insertion {
	
	public static void main(String[] args) {
		int length;
		int counter;
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		length = input.nextInt();
		int []arr = new int[length];
		for(counter=0;counter<length;counter++) {
			System.out.println("Enter the number"+counter);
			arr[counter] = input.nextInt();
		}
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//printArray(arr);
		input.close();
	}
	public static int[] sort(int[] A) {
		for(int counter=1;counter<A.length;counter++) {
			int temp,key;
			key = A[counter];
			temp = counter-1;
			while((temp>=0)&&(key<A[temp])) {
				A[temp+1]=A[temp];
				temp--;
			}
			A[temp+1]=key;
		}
		return A;
	}
	/*public static void printArray(int[] A) {
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}*/
	

}
