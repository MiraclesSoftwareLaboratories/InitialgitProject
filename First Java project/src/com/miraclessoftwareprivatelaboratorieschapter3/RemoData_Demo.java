package com.miraclessoftwareprivatelaboratorieschapter3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RemoData_Demo {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			File file = new File("File.txt");
			fr = new FileReader(file);
			char[]a= new char[5];
			fr.read(a);
			for(char c : a)
				System.out.println(c);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
