package com.miraclessoftwareprivatelaboratorieschapter3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		process();
		
	}
	public static void process()throws IOException, FileNotFoundException {
		File f = new File("abc.txt");
		f.getAbsolutePath();
		
		//try {
			FileInputStream fs = new FileInputStream(f);
			//throw new FileNotFoundException();
			FileNotFoundException fe = new FileNotFoundException();
			throw fe;
			//fs.read();
		//}
		/*catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Inside IOException"+e.getMessage());
		}*/
	//	System.out.println("");
	//	System.err.println();
	
	//	fs.close();
		
	}
}
