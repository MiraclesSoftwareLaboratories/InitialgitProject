package miracleslaboratories;

import java.util.Scanner;

//Exchanging First and Last Character of the String
public class Exchange_First_last_Character {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = new String();
		System.out.println("Please enter the String");
		string = scan.next();
		char first = string.charAt(0);
		char last = string.charAt(string.length()-1);
		System.out.println("First character of the string is "+first);
		System.out.println("Last character of the string is "+last);
		System.out.println("After Replacement string become");
		int length = string.length();
		System.out.println(string.charAt(length-1)+string.substring(1, length-1)+string.charAt(0));
		scan.close();
	}

}
