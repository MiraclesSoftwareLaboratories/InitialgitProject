package miracleslaboratories;

import java.util.Scanner;

//Remove the character from the input array
public class StringRemoval {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string");
		String string=scan.next();
		System.out.println("Enter the index from which element is to be deleted");
		int ind=scan.nextInt();
		StringBuilder sb = new StringBuilder(string);
		sb.deleteCharAt(ind);
		System.out.println(sb.toString());
		scan.close();
	}

}
