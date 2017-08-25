package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Scanner;

//Changed Alphabet Program With using ToLowerCase
public class AlphabetChanged {
	public static void main(String[] args) {
		int counter1,counter2,number;
		String temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many names do you want to enter");
		number=scan.nextInt();
		String [] names=new String[number];
		String [] names2=new String[number];
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter names");
		for(counter1=0;counter1<number;counter1++) {
			names[counter1]=scan2.nextLine();
		}
		/*for(counter1=0;counter1<number;counter1++) {
			for(counter2=0;counter2<number;counter2++) {
				names2[counter2]=names[counter1].toLowerCase();
			}
		}*/
		for(counter1=0;counter1<number;counter1++) {
			for(counter2=counter1+1;counter2<number;counter2++) {
				if(names2[counter1].compareTo(names2[counter2])>0) {
					temp=names2[counter1];
					names2[counter1]=names2[counter2];
					names2[counter2]=temp;
				}
			}
		}
		System.out.println("Names in sorted way");
		   for(counter1=0;counter1<number-1;counter1++) {
			   System.out.println(names2[counter1]+" ");
		   }
		   System.out.println(names2[counter1-1]);
		scan.close();
		scan2.close();
		
			
	}

}
