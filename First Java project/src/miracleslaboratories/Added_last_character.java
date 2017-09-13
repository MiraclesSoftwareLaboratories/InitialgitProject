package miracleslaboratories;

import java.util.Scanner;

// Added last character of string at beginning and end.
public class Added_last_character {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = new String();
		System.out.println("Please enter the string");
		string = scan.next();
		char end = string.charAt(string.length()-1);
		System.out.println("'"+end+string+end+"'");
		scan.close();
	}
	

}
