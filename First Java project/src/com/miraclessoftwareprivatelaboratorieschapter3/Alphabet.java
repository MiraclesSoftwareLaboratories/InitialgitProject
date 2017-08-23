package com.miraclessoftwareprivatelaboratorieschapter3;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
        int n;
        String temp;
        File f=new File("abc.txt");
        FileReader fr = new FileReader(f);
        fr.close();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        for(int i=0; i<n; i++) {
        		System.out.println("Enter the name:");
        		names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(names[i]+" ");
        }
        System.out.print(names[n - 1]);
    }
}


