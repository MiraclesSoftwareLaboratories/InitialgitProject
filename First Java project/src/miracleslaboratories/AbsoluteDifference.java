package miracleslaboratories;

import java.util.Scanner;

//Implementing Absolute Difference
public class AbsoluteDifference {
	public static void main(String[] args) {
		int num=21;
		int ent_num,result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the value for calculating Absolute Difference");
		ent_num=scan.nextInt();
		if(ent_num>num) {
			result=((ent_num-num)*2);
		}
		else {
			result=(num-ent_num);
		}
		System.out.println(result);
		scan.close();
	}

}
