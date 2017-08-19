package com.miracles.july13;
//Implementation of enum
public class Enum {
	enum CoffeSize{SMALL, LARGE, HUGE}
	CoffeSize size;
}
class CoffeTest{
	public static void main(String[] args) {
		Enum obj= new Enum();
		obj.size=Enum.CoffeSize.HUGE;
		System.out.println(obj.size);
	}
	
}
