package miracleslaboratories;

import java.util.Arrays;
import java.util.Scanner;

// Arranging words in Ascending Order and Removing WhiteSpaces
public class Arrange_Words_In_Ascending_Order {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = new String();
		String temp;
		boolean flag = true;
		System.out.println("Please enter the String");
		string = scan.nextLine();
		String string1 = string.replaceAll(" ","" );
		System.out.println(string1);
		String[] strArray = string1.split(" ");
		int length = strArray.length;
		while(flag) {
			flag = false;
			for(int index = 0;index<strArray.length-1;index++) {
				if(strArray[index].compareToIgnoreCase(strArray[index+1])>0) {
					strArray[index] = strArray[Integer.parseInt(string.substring(index,index+1))];
					/*temp = strArray[index];
					strArray[index] = strArray[index+1];
					strArray[index+1] = temp;*/
					flag = true;
			}
		}
		}
		System.out.println("After sorting the String is ");
		for(int index = 0;index<strArray.length;index++) {
			System.out.println(strArray[index]);
		}
		System.out.println(strArray[length-1]);
		scan.close();
		
	}

}
