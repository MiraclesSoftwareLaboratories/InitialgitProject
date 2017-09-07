package com.miraclessoftwareprivatelaboratorieschapter3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
//Throws Exception
public class ThrowsException {
	public static void main(String[] args) {
		System.out.println("Exception Throwing");
		
		
		try {
			exceptionthrows();
			//if(fileNotFoundException)
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
		catch (IOException e) {
			System.out.println("File I/O Exception");
		}
		catch(Exception e) {
			System.out.println();
		}
		
	}
	public static void exceptionthrows() throws FileNotFoundException {
		File f = new File("abc.txt");
		FileInputStream fs = new FileInputStream(f);
	}

}
