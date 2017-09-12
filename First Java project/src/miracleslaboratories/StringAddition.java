package miracleslaboratories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Adding the Not word to the given string
public class StringAddition {
	public static void main(String[] args) {
		stringcomparison_addition();
	}
	public static void stringcomparison_addition() {
		Scanner scan=new Scanner(System.in);
		String string = new String();
		System.out.println("Please enter the string");
		string = scan.next();
		if(string.startsWith("Not")||string.startsWith("NOt")||string.startsWith("NOT")||string.startsWith("NoT")||string.startsWith("not")||string.startsWith("nOT")||string.startsWith("noT")||string.startsWith("nOt")) {
			System.out.println(string);
		}
		else {
			string = "Not "+string;
			System.out.println(string);
		}
		scan.close();
	}

}

