package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Insertion Sorting in Descending order
public class DescendingSorting {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		long millis = System.currentTimeMillis(); 
		System.out.println(millis);
		int length;
		int counter;
		Scanner input = new Scanner(System.in);
		System.out.println("How many number do you want to enter");
		length = input.nextInt();
		int [] arr = new int[length];
		for(counter=0;counter<length;counter++) {
			System.out.println("Enter the number"+counter);
			arr[counter]= input.nextInt();
		}
		insertSortingDescending(arr);
		System.out.println("In Descending order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		input.close();
		System.out.println("\n"+sdf.format(cal.getTime()));
		System.out.println(millis);
		
	}
	public static int[] insertSortingDescending(int[] Arr) {
		for(int counter=1;counter<Arr.length;counter++) {
			int temp,key;
			key = Arr[counter];
			temp = counter-1;
			while((temp>=0)&&(key<Arr[temp])) {
				Arr[temp+1]=Arr[temp];
				temp--;
			}
			Arr[temp+1]=key;
		}
		return Arr;
		
	}

	
	
}
