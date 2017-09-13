package miracleslaboratories;

import java.util.Scanner;

// First 3 Character repetition
public class Multiple_character_concatination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = new String();
		System.out.println("Please enter the String.");
		string = scan.next();
		String newstring = string.substring(0, 3);
		System.out.println("'"+newstring+newstring+newstring+"'");
		scan.close();
	}

}
