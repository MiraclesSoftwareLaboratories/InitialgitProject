package com.miraclessoftwareprivatelaboratorieschapter3;

import java.util.Random;
import java.lang.Exception;

//Program for Generating and Comparing Random Numbers
class MyException extends Exception{
	/*String errorMessage;
	public MyException() {
		this.errorMessage=errorMessage;
	}*/
	@Override
	public String toString() {
		return "Values are same";
	}
}
public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int monkeyA=random.nextInt(50);
		int monkeyB=random.nextInt(50);
		int user=random.nextInt(50);
		if((user==monkeyA)&&(user==monkeyB)&&(monkeyA==monkeyB)) {
			try {
				throw new MyException();
			}
			catch(MyException e) {
				System.out.println(e);
			}	
		}
		if((user>monkeyA)&&(user>monkeyB)) 
			System.out.println("User is the Winner");
		else {
			if(((monkeyA>user)&&(monkeyA>monkeyB))) {
				System.out.println("       User loses the Game");
				System.out.println("MonkeyA is the Winner");
			}
			else {
				System.out.println("       User loses the Game");
				System.out.println("MonkeyB is the Winner");
			}
			
		}
		System.out.println("The value of user is "+user+"."+"\nThe value of MonkeyA is "+monkeyA+"."+"\nThe value of MonkeyB is "+monkeyB+".");
	}

}


