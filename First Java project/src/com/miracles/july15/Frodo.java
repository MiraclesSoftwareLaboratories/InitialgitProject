package com.miracles.july15;
//Q9 from Exercise
public class Frodo extends Hobbit{
	public static void main(String[] args) {
		Short myGold=7;
		System.out.println(countGold(myGold,6));
	}
}
class Hobbit{
	static int countGold(int x,int y) {
		return (x+y);
	}
}
//Make the function (countGold) static on my own