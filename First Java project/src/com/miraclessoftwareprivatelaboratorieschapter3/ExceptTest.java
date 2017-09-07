package com.miraclessoftwareprivatelaboratorieschapter3;
import java.io.*;
// Exception Handling with Array
public class ExceptTest {
	public static void main(String[] args) {
		int []a = new int [2];
		try {
			System.out.println("Access element 3"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception throws "+e);
		}
		finally {
			a[0]=6;
			System.out.println("The First element of the array is "+a[0]);
		}
	}

}
